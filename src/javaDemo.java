import java.sql.Connection;
import java.sql.DriverManager;

public class javaDemo {
    public static void main(String[] args) {
        try {
            // Load driver (optional in newer versions, but safe)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct URL format
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/student",
                    "root",
                    "Munna@3307"
            );

            System.out.println("Success");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}