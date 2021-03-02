import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.IDN;
import java.security.cert.TrustAnchor;

public class Main {
    private static String ID;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Instructor tutor = new Instructor();
        String input;


        while (true) {
            showMainMenuList();
//            Check break out condition
            if ((input = br.readLine()).contains("quit")) {
                break;
            }
//            print all student list
            if (input.contains("student list")) {
                tutor.printList();
            } else if (input.contains("search student")) {
                System.out.println("Student ID: ");
                int ID = Integer.parseInt(br.readLine());
                tutor.searchStudentProfile(ID);
            }

            for (int i = 0; i < 40; i ++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void showMainMenuList() {
        System.out.println("1. Print student list" + "\n" +
                "2. Search student" + "\n" +
                "3. Quit");
    }

    public static void takeUserOption(String option) {

    }
}
