package sqlquery.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sqlquery.model.Player;

public class DBQuery {

    private final Connection connection;

    public DBQuery() throws SQLException {
        this.connection = DBConnection.getConnection();
    }

    public void findPlayer(String name) throws SQLException {

        String sql = "SELECT * FROM player WHERE first_name LIKE ?";
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Found player: " + rs.getString("first_name"));
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

    public static void main(String[] args) {
        try {
            DBQuery dbQuery = new DBQuery();
            dbQuery.findPlayer("Kat%");

            //Team team = new Team("XlpM0XkE", "Golf");
            //Player newPlayer = new Player("IT326", "John", "Doe", 10, "Guard", team, true);
            //dbQuery.addPlayer(newPlayer);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
