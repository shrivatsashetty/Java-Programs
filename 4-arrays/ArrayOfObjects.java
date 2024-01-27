/* We will create an array which can hold objects */

class SchoolKid{
    String name;
    int rollNo;
    float marks;

    SchoolKid(int rollNo, String name, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void showStudentDetails(){
        System.out.println("Roll No :" + this.rollNo + "\nName: " + this.name + "\nMarks: " + this.marks);
    }
}

public class ArrayOfObjects {

    public static void main(String[] args){
        SchoolKid student1 = new SchoolKid(1, "Harsh", 77.5f);
        SchoolKid student2 = new SchoolKid(2, "Deepak", 85.4f);
        SchoolKid student3 = new SchoolKid(3, "Naveen", 80.4f);
    
        SchoolKid[] StudentsList= new SchoolKid[3];
    
        StudentsList[0] = student1;
        StudentsList[1] = student2;
        StudentsList[2] = student3;

        // using enhanced for loop to print name of each student
        System.out.println("We have the following students in our array:");
        for(SchoolKid student : StudentsList){
            System.out.println(student.name);
        }
    }
}
