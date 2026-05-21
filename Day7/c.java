import java.io.FileWriter;
public class c {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("marks.txt");
            fw.write("Gokul: 90\n");
            fw.write("Sai: 85\n");
            fw.close();
            System.out.println("Data written Successfully ");
        } catch (Exception e) {
            System.out.println(e);            
        }
    }
}
 