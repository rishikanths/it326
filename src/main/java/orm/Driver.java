package orm;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import orm.db.HibernateUtil;
import orm.dbo.PlayerOpertions;
import orm.models.Player;

public class Driver {

    public static void main(String[] args) {
        PlayerOpertions.getPlayers();
    }

}
