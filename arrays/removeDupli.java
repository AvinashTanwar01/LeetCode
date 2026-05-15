import java.util.*;
public class removeDupli {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(dupli(arr));
    }
    public static int dupli(ArrayList<Integer> arr){
        int i=0;
        for(int j=1;j<arr.size();j++){
            if(!arr.get(i).equals(arr.get(j))){
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i+1;
    }
}
