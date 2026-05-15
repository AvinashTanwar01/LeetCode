import java.util.Scanner;

public class conatinerwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = twopoint(arr, n);
        System.out.println(result);

    }
    public static int twopoint(int[] arr,int n){
        int left=0;
        int right=n-1;
        int maxarea=0;

        while(left<right){
            int h = Math.min(arr[left], arr[right]);
            int w= right-left;
            int area= h*w;
            maxarea= Math.max(maxarea,area);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
