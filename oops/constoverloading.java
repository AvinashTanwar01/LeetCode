class Student{
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    //passs data of on student to another 
    Student(Student other){
        this.rno= other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}

public class constoverloading {
    public static void main(String[] args) {
        Student kunal = new Student(10,"Avinash",24f);
        Student rahul = new Student(kunal);
      

        System.out.println(kunal.rno);
        System.out.println(rahul.rno);

    }

}

