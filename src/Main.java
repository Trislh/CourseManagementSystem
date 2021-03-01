import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.IDN;

public class Main {
    private static String ID;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Instructor tutor = new Instructor();

//        try {
//            System.out.println("Enter your ID: ");
//            ID = br.readLine();
//        } catch (Exception e) {
//            System.out.println("Something wrong with the ID. Please try again.");
//        }


        tutor.printList();
//        tutor.printLine();

    }
}
