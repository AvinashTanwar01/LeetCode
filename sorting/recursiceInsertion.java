import java.util.Scanner;

public class recursiceInsertion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");    
        }
    }

    public static void insertionsort(int[] arr,int i, int n){
        // for(int i=0;i<=n-1;i++){

        if(i==n) return;
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        insertionsort(arr, i+1, n);
        // }
    }
}
