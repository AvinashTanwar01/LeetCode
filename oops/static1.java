public class static1 {
    int age;
    int name;
    static long pop;

    class static1(int age, int name){
        this.age=age;
        this.name=name;
        static1.pop=+1;
    }
}
