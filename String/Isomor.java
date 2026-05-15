public class Isomor {
    public static void main(String[] args){
        String s="foo";
        String s1="boo";
        int arr[]= new int[256];
        int arr1[]= new int[256];
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]!=arr1[s1.charAt(i)]){
                System.out.println("False");
                return;
            }
            arr[s.charAt(i)]=i+1;
            arr1[s1.charAt(i)]=i+1;
        }
        System.out.println("True");
    }
}
