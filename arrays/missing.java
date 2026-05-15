import java.util.Scanner;

public class missing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = Xor(arr, n);
        System.out.println(result);
        sc.close();
    }

    public static int missing(int[] arr, int n){
        int[] hash = new int[n + 2]; 
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        for(int i = 1; i <= n+1; i++){  
            if(hash[i] == 0){
                return i;
            }
        }

        return -1; 
    }
    public static int Sum(int[] arr,int n){
        int sum= (n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return sum-sum2;
    }
    public static int Xor(int[] arr,int n){
        int xor2=0;
        int xor1=0;
        // for 0-N use n and xor 1 as i not +1
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return xor2^xor1;

    }
}