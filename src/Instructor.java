import java.io.*;

public class Instructor {
    private int ID;
    private String name;
    private String project;
    private String feedback;
    private String data = "";
    private final String src = "src\\StudentList.txt";

    public void setID(int ID) {this.ID = ID;}
    public void setData(String data) {this.data = data;}
    public void setName(String name) {this.name = name;}
    public void setFeedback(String feedback) {this.feedback = feedback;}
    public void setProject(String project) {this.project = project;}

    public int getID() {return ID;}
    public String getFeedback() {return feedback;}
    public String getName() {return name;}
    public String getProject() {return project;}

    /*
    * Print all student list
    * Input: no para
    * Output: String data
    */
    public void printList() {
        try {
            File file = new File(src);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * Search for student via their ID
    * Input: ID is taken from the user.
    * Output: The line of dataset that match with input ID.
    */
    public void searchStudentProfile(int ID) {
        try {
            File file = new File(src);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((data = br.readLine()) != null) {
                splitData(data);
                if (getID() == ID) {
                    System.out.println(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * Split data from file txt into subString. Set each Sub data into class's properties.
    * Input: String data
    * Output: No return*/
    private void splitData(String data) {
        String[] partData = data.split(",");
//        split and set data into properties
        setID(Integer.parseInt(partData[0]));
        setName(partData[1]);
        setProject(partData[2]);
        setFeedback(partData[3]);
    }
}
