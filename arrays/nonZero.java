import java.util.*;
public class  nonZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // zero(arr,n);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int[] ans = optimal(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
    public static void zero(int[] arr,int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }

        for(int i=temp.size();i<n;i++){
            arr[i]=0;
        }
    }

    public static int[] optimal(int[] arr,int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
