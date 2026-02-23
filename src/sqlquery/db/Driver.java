package sqlquery.db;

import java.sql.SQLException;

public class Driver {
        public static void main(String[] args) {
        try {
            
            DBQuery dbQuery = new DBQuery();
            String userInput = "Kat";
            dbQuery.findPlayer(userInput+"%");

            //Team team = new Team("XlpM0XkE", "Golf");
            //Player newPlayer = new Player("IT326", "John", "Doe", 10, "Guard", team, true);
            //dbQuery.addPlayer(newPlayer);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
