import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorLogExample {

    public static void main(String[] args) {

        try {

            // Code that causes error
            int result = 10 / 0;

            System.out.println(result);

        } catch (Exception e) {

            System.out.println("Praneeth Royal!");

            // Write error into log file
            try {

                FileWriter fw = new FileWriter("error_log.txt", true);
                PrintWriter pw = new PrintWriter(fw);

                pw.println("Error Message: " + e.getMessage());
                pw.println("Exception Type: " + e);
                pw.println("--------------------------");

                pw.close();

                System.out.println("Error logged into error_log.txt");

            } catch (IOException io) {

                System.out.println("Unable to write log file");
            }
        }
    }
}