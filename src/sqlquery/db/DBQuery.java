package sqlquery.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import sqlquery.model.Player;
import sqlquery.model.Team;

public class DBQuery {

    private final Connection connection;

    public DBQuery() throws SQLException {
        this.connection = DBConnection.getConnection();
    }

    public void findPlayer(String name) throws SQLException {

        String sql = "SELECT * FROM player as p, teams as t "+
                        "WHERE p.team_id = t.id and p.first_name LIKE ?";
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                List<Player> players = QueryObject.createPlayer(rs);
            }
            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPlayer(Player player) throws SQLException {

        String sql = "INSERT INTO player (id, first_name, last_name, number, position, team_id, active) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(sql);
            pstmt.setString(1, player.getId());
            pstmt.setString(2, player.getFirstName());
            pstmt.setString(3, player.getLastName());
            pstmt.setInt(4, player.getNumber());
            pstmt.setString(5, player.getPosition());
            pstmt.setString(6, player.getTeam().getId());
            pstmt.setBoolean(7, player.isActive());
            int rows = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rows);

            pstmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
