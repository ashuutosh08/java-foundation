Class — PascalCase

class StudentDemo { }       // correct
class studentdemo { }       // wrong
class student_demo { }      // wrong

Method — camelCase

public void getStudentName() { }    // correct
public void GetStudentName() { }    // wrong
public void get_student_name() { }  // wrong

Variable — camelCase

String studentName;     // correct
String StudentName;     // wrong
String student_name;    // wrong

Constant — UPPER_SNAKE_CASE

static final int MAX_MARKS = 100;    // correct
static final int maxMarks = 100;     // wrong
static final int max_marks = 100;    // wrong

Package — lowercase

package core_oop_03;      // correct
package Core_OOP_03;      // wrong
package CoreOOP03;        // wrong








package core_oop_03;                            // lowercase — package

class StudentDemo {                             // PascalCase — class

    static final int MAX_MARKS = 100;           // UPPER_SNAKE — constant

    String studentName;                         // camelCase — variable
    int rollNumber;                             // camelCase — variable

    public StudentDemo(String studentName) {    // PascalCase — constructor
        this.studentName = studentName;
    }

    public String getStudentName() {            // camelCase — method
        return studentName;
    }

    public void setRollNumber(int rollNumber) { // camelCase — method
        this.rollNumber = rollNumber;
    }
}