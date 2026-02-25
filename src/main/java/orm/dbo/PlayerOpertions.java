package orm.dbo;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import orm.db.HibernateUtil;
import orm.models.Player;

public class PlayerOpertions {
    
    public static List<Player> getPlayers(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Player", Player.class);
        query.setMaxResults(5);
        List<Player> players = query.getResultList();
        for (Player player : players) {
            System.out.println(player.getFirstName());
        }
        
        return players;
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
            System.out.println(player.getFirstName());
        }
    }

    public static boolean savePlayer(Player p){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.persist(p);

        return true;
    }

    public static List<Player> getPlayerUsingcritea() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Player> cq = cb.createQuery(Player.class);
        Root<Player> root = cq.from(Player.class);
        cq.select(root);

        TypedQuery<Player> typedQuery = session.createQuery(cq);
        typedQuery.setMaxResults(10); // Limits the results to 1

        List<Player> players = typedQuery.getResultList();
       
        for (Player player : players) {
            System.out.println(player.getFirstName());
        }
        return players;
    }



}
