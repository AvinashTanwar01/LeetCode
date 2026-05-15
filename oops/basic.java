class Student{
    int rno;
    String name;
    float marks;

    //callling one constructor from another constructor 
    Student(){
        //pointing the defined one 
        this(20, "Avinash", 24f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    //another way of defining in a consturctor without this keyword just use diff names in paranthesis
    // Student(int rn, String nam, float mark) {
    //     rno = rn;
    //     name = nam;
    //     marks = mark;
    // }
}

public class basic {
    public static void main(String[] args) {
        Student kunal = new Student(10,"Avinash",24f);
        Student rahul = new Student();
        // kunal.rno=10;
        // kunal.name="Avinash";
        // kunal.marks=24f;

        System.out.println(kunal.rno);
        System.out.println(rahul.rno);

    }

}
