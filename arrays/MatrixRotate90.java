import java.util.Scanner;

public class MatrixRotate90 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        reverse(arr, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] brute(int[][] arr, int n){
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[j][n - i - 1] = arr[i][j];
            }
        }
        return ans;
    }

    public static void reverse(int[][] arr, int n){

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;                
            }
        }
        

        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = arr[i][left];       
                arr[i][left] = arr[i][right];   
                arr[i][right] = temp;          
                left++;
                right--;
            }
        }
    }
}