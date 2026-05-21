import java.sql.*;

public class studentCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/student_v1";
    static final String USER = "root", PASS = "cec123";

    // ✅ CREATE — Insert a student
    static void insertstudent(String name, int age, double marks) {

        String sql = "INSERT INTO students (name, age, marks) VALUES (?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {

            pstmt.setString(1, name);      // ? #1 = name
            pstmt.setInt(2, age);          // ? #2 = age
            pstmt.setDouble(3, marks);    // ? #3 = marks

            int rows = pstmt.executeUpdate();

            System.out.println("Inserted " + rows + " student: " + name);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
       insertstudent("Gokoo", 21, 93.8);
    }
}
