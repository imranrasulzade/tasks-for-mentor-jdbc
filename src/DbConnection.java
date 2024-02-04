import java.sql.*;

public class DbConnection {
    static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/hr";

        static final String USERNAME = "postgres";

        static final String PASSWORD = "12345678";
        public static Connection CONNECTION;

        public void connect() throws SQLException {
        try{
            CONNECTION = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            System.out.println("Connection successfully 🤍");

        }catch (Exception e){
            System.out.println("CONNECTION ERROR!  " + e.getMessage());
        }
    }
    public void disconnect() {
        try {
            if (CONNECTION != null && !CONNECTION.isClosed()) {
                CONNECTION.close();
                System.out.println("Connection disconnected!");
            }
        } catch (SQLException e) {
            System.out.println("DISCONNECTION ERROR: " + e.getMessage());
        }
    }

}



/*PSVM
DbConnection dbConnection = new DbConnection();
        Statement statement;
        PreparedStatement preStmnt;
        try{
            dbConnection.connect();
//            statement = DbConnection.CONNECTION.createStatement();
//            statement.executeUpdate(IQuery.createSchema);
//            statement.close();

//            statement = DbConnection.CONNECTION.createStatement();
//            statement.executeUpdate(IQuery.createTable);
//            statement.close();

            preStmnt = DbConnection.CONNECTION.prepareStatement(IQuery.insert);
            preStmnt.setString(1, "Rashad");
            preStmnt.setString(2, "Ismayilov");
            preStmnt.setInt(3, 1);
            System.out.println(preStmnt.executeUpdate() + " rows inserted");
            preStmnt.close();

            preStmnt = DbConnection.CONNECTION.prepareStatement(IQuery.updateStatus);
            preStmnt.setInt(1, 10);
            preStmnt.setInt(2, 1);
            preStmnt.executeUpdate();
            preStmnt.close();

            ResultSet rs = DbConnection.CONNECTION.createStatement().executeQuery(IQuery.allRead);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int status = rs.getInt("status");
                System.out.println("ID: " + id + "\n" +
                        "NAME: " + name + "\n" + "SURNAME: " + surname + "\n" + "STATUS: " + status);
                System.out.println();
            }
            rs.close();

//            preStmnt = DbConnection.CONNECTION.prepareStatement(IQuery.delete);
//            preStmnt.setInt(1,5);
//            preStmnt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnection.disconnect();

        }

 */
