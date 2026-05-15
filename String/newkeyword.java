
public class newkeyword {
    public static void main(String[] args){
        String A= "Avi";
        String B= "Avi";
        System.out.println(A==B);//poitning to same in string pool not different

        String a= new String("Avi");
        String b= new String("Avi");
        System.out.println(a==b);// poitning to different not in string pool but inside heap

        System.out.println(a.equals(b));//just checks for value not same refrence
    }    
}
