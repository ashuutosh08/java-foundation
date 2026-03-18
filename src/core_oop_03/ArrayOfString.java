package core_oop_03;
class Student{
    int roll;
    String name;
    int marks;

}
public class ArrayOfString {
    public static void main(String[] args ){

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Harsh";
        s1.marks = 57;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Ashutosh";
        s2.marks = 67;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ram";
        s3.marks = 78;


        Student students[] = new Student[3];
        students [0] = s1;
        students [1] = s2;
        students [2] = s3;

        for(int i=0; i< students.length; i++){
            System.out.println(students[i].roll + "-" +  students[i].name + ":" + students[i].marks );
        }

//            Access elements of an array by for-each or enhanced for loop


        for(Student s  : students){
            System.out.println(s.roll + "-" + s.name + ":" + s.marks );

        }






    }
}
