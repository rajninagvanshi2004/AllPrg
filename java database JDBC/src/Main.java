import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rajnidb", "root", "satna"
            );
            // Create statement
            Statement statement = connection.createStatement();
            // Execute query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
            // Process results
            while (resultSet.next()) {
                int code = resultSet.getInt("empid");
                String name = resultSet.getString("empname").trim();
                System.out.println("empId: " + code + " | Name: " + name);
            }
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}