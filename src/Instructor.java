import java.io.*;

public class Instructor {
    private int ID;
    private String name;
    private String project;
    private String feedback;
    private String data = "";

    public void setID(int ID) {this.ID = ID;}
    public void setData(String data) {this.data = data;}
    public void setName(String name) {this.name = name;}
    public void setFeedback(String feedback) {this.feedback = feedback;}
    public void setProject(String project) {this.project = project;}

    public int getID() {return ID;}
    public String getFeedback() {return feedback;}
    public String getName() {return name;}
    public String getProject() {return project;}

    public void printList() {
        try {
            File file = new File("src\\StudentList.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printLine() {
        try {
            File file = new File("src\\StudentList.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (data.equals(br.readLine())) {
                System.out.println(data);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void splitData(String data) {
        String[] partData = data.split(",");
//        split and set data into properties
        setID(Integer.parseInt(partData[0]));
        setName(partData[1]);
        setProject(partData[2]);
        setFeedback(partData[3]);
    }

    public void printStudentProfile(int ID) {

    }
}
