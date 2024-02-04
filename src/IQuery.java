public interface IQuery {
    public static String createSchema = "";

    public static String createTable = "";

    public static String insert = "insert into students.info(name, surname, status) values (?, ?, ?)";

    public static String allRead = "select * from employee";

    public static String updateStatus = "update students.info set status = ? where id = ?";

    public static String delete = "delete from students.info where id = ?";
}
