import java.util.Scanner;

public class tallsubtower{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr,n));
    }

    public static int max(int[] arr,int n){
        int maxlen=1;
        int currlen=1;
        for (int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                currlen++;
                maxlen=Math.max(currlen,maxlen);
            }else{
                currlen=1;
            }
        }
        return maxlen;
    }
}