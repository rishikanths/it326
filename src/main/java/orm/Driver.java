package orm;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import orm.db.HibernateUtil;
import orm.models.Player;

public class Driver {

    public static void hqlQuery() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Player", Player.class);
        query.setMaxResults(20);
        List<Player> players = query.getResultList();
        for (Player player : players) {
            System.out.println(player.getFirstName() + " " + player.getLastName());
        }

    }

    public static void criteriaQuery() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Player> cq = cb.createQuery(Player.class);
        Root<Player> root = cq.from(Player.class);
        cq.select(root);

        TypedQuery<Player> typedQuery = session.createQuery(cq);
        typedQuery.setMaxResults(10); // Limits the results to 1

        List<Player> results = typedQuery.getResultList();
       
        for (Player player : results) {
            System.out.println(player.getFirstName() + " " + player.getLastName());
        }

    }

    public static void main(String[] args) {
        hqlQuery();
        //criteriaQuery();
    }

}
