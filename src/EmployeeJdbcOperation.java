import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeJdbcOperation {

    public static List<EmployeeDto> getAllEmployee() throws SQLException {
        DbConnection dbConnection = new DbConnection();
        dbConnection.connect();
        ResultSet rs = DbConnection.CONNECTION.createStatement().executeQuery(IQuery.allRead);
        var list = new ArrayList<EmployeeDto>();
        while (rs.next()){
            EmployeeDto employeeDto = new EmployeeDto(
                    rs.getInt("employee_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("job_title"),
                    rs.getInt("department_id"),
                    rs.getDate("birthdate").toLocalDate(),
                    rs.getDouble("salary"),
                    rs.getInt("old_location_id"),
                    rs.getInt("new_location_id")
            );
            list.add(employeeDto);
        }
        rs.close();
        dbConnection.disconnect();
        return list;
    }
}
