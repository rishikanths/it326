package sqlquery.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sqlquery.model.Player;
import sqlquery.model.Team;

public class QueryObject {

    public static List<Player> createPlayer(ResultSet rs) throws SQLException {
        List<Player> players = null;
        if (rs != null) {
            players = new ArrayList<>();
            while (rs.next()) {
                Team temp = null;
                Player p = null;
                temp.setId(rs.getString("t.id"));
                temp.setName(rs.getString("name"));

                p.setId(rs.getString("id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setNumber(rs.getInt("id"));
                p.setPosition(rs.getString("position"));
                p.setTeam(temp);
                p.setActive(rs.getBoolean("active"));

                players.add(p);
            }
        }

        return players;
    }

}
