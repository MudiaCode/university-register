public class Student {
    String firstName;
    String lastName;
    int studentID;
    String course;
    String Module;

    Student(){
    }

    public void studentID() {
        studentID = UniqueID.generateUniqueIdentifier();
    }
}
