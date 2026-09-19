import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {
    public static void main(String[] args){
        try {
            // Load driver (optional in newer versions, but safe)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correct URL format
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/student",
                    "root",
                    "Munna@3307"
            );
            System.out.println("Datbase connected");
            PreparedStatement ps = con.prepareStatement("insert into student01(id,name,course,age) values(?,?,?,?)");
            ps.setInt(1, 102);
            ps.setString(2, "Karthikeya");
            ps.setString(3, "CSM");
            ps.setInt(4, 19);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("row inserted successfully");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}