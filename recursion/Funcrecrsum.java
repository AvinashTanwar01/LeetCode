public class Funcrecrsum {
    public static void main(String[] args) {
        int n =2;
        // System.out.println(sum(n));  
        System.out.println(fact(n));  
    }
    //sum for n number
    // public static int sum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+sum(n-1);
    // }

    // factorial 
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

}
