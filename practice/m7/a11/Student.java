import java.util.Scanner;
/**
 * Class for student.
 */
final class Student {
/**
* array of marks.
*/
private float[] marks;
/**
 * name of the student.
 */
private String sname;
/**
 * id of the student.
 */
private String id;
/**
 * Constructs the object.
 *
 * @param      stuname  The stuname
 * @param      iden     The iden
 * @param      mark     The mark
 */
Student(final String stuname, final String iden, final float[] mark) {
    this.sname = stuname;
    this.id = iden;
    this.marks = mark;
}
/**
 * Calculates the gpa.
 *
 * @return     The gpa.
 */
public float calculateGpa() {
    float sum = 0;
    final int three = 3;
    for (int i = 0; i < three; i++) {
        sum += marks[i];
    }
    float gpa = sum / three;
    return gpa;
}

/**
 * { function_description }.
 *
 * @param      args  The arguments
 */
public static void main(final String[] args) {
    Scanner s = new Scanner(System.in);
    String sname = s.nextLine();
    String id = s.nextLine();
    final int three = 3;
    float[] marks = new float[three];
    for (int i = 0; i < three; i++) {
        marks[i] = s.nextFloat();
    }
    Student student = new Student(sname, id, marks);
    System.out.println("ID\t" + " " + "Name\t" + " " + "GPA\t");
    System.out.println(id + "" + " " + sname + "" + " "
        + student.calculateGpa());

    }
}
