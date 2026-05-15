import java.util.Scanner;

public class highestOcuuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(mostFrequentElement(arr));
        
        sc.close();
    }

    public static int mostFrequentElement(int[] nums){
        int[] hash= new int[10001];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
        }

        int max=0;
        int result=Integer.MAX_VALUE;

        for(int i=1; i<=1000 ;i++){
            if(hash[i]>max){
                max=hash[i];
                result=i;
            }
        }

        return result;
    }
}


