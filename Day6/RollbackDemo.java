import java.sql.*;
public class RollbackDemo {
  public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String pass = "vinith123";

        Connection conn = null;

        try {

       
            conn = DriverManager.getConnection(url, user, pass);
             conn.setAutoCommit(false);
             Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                "UPDATE accounts SET balance = balance - 500 WHERE id = 1"
            );
             stmt.executeUpdate(
                "UPDATE accnts SET balance = balance + 500 WHERE id = 2"
            );

            conn.commit();

            System.out.println("Transaction Successful!");

        } catch (SQLException e) {

            try { 
                if (conn != null) {
                    conn.rollback();
                }

                System.out.println("Transaction Rolled Back!");

            } catch (SQLException ex) {

                System.out.println("Rollback Failed!");
            }
        }
    }
}
