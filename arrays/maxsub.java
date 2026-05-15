import java.util.*;

public class maxsub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int ans = kaedneopt(arr,n);
        System.out.println(ans);
    }

    public static int better(int[] arr,int n){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max= Math.max(sum,max);
            }
        }
        return max;
    }

    public static int kaedneopt(int[] arr,int n){
        int sum=0,start=0;
        int max=Integer.MIN_VALUE;
        int Astart= -1;
        int Aend= -1;
       for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; 

            sum += arr[i];

            if (sum > max) {
                max = sum;
                Astart = start;
                Aend = i;
            }


            if (sum < 0) {
                sum = 0;
            }
        }

        // System.out.print("The subarray is: [");
        // for (int i = Astart; i <= Aend; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.print("]");
        System.out.println("The start index is "+Astart+" and end is "+Aend);
        return max;
    }

}
