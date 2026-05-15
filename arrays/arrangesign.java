import java.util.*;

public class arrangesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // better(arr, n);
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // int[] result= optimal(arr, n);
        int[] result= notequal(arr, n);
        
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    
    public static void better(int[] arr, int n) {
        int b = n / 2;
        int[] pos = new int[b];
        int[] neg = new int[b];
        int posIndex = 0, negIndex = 0;  
        

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                pos[posIndex] = arr[i]; 
                posIndex++;
            } else {
                neg[negIndex] = arr[i];  
                negIndex++;
            }
        }
        
        
        for(int i = 0; i < b; i++){  
            arr[2 * i] = pos[i];      
            arr[(2 * i) + 1] = neg[i]; 
        }
    }
    public static int[] optimal(int[] arr,int n){
        int[] ans=new int[n];
        int posindex=0;
        int negindex=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[posindex]= arr[i];
                posindex+=2;
            }else{
                ans[negindex]= arr[i];
                negindex+=2;
            }
        }
        return ans;
        
    }
// for when the pos are not equal to neg
    public static int[] notequal(int[] arr,int n){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[2*i]=pos.get(i);
                arr[(2*i)+1]=neg.get(i);
            }

            int index= neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr[index]=pos.get(i);
                index++;
            }
        }else{
            for(int i=0;i<pos.size();i++){
                arr[2*i]=pos.get(i);
                arr[(2*i)+1]=neg.get(i);
            }

            int index= pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                arr[index]=neg.get(i);
                index++;
            }
        }
        return arr;

    }

}