import java.sql.SQLException;


public class Main {

        public static void main(String[] args) throws SQLException {
            checkConnection();
            var list = EmployeeJdbcOperation.getAllEmployee();
            for (EmployeeDto employeeDto: list) {
                System.out.println(employeeDto);
                System.out.println("===========================");
            }

    }

    private static void checkConnection(){
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage() + "Driver not found");
        }
    }
}