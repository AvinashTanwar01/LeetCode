import java.util.*;

public class map {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i =0;i<n;i++){
           int key =arr[i];
           int freq=0;
           if(mpp.containsKey(key)) freq=mpp.get(key);
           freq++;
           mpp.put(key,freq);
        }  
        
        //for showing how it iterates in the map 
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            System.out.println(it.getKey() + " -> " + it.getValue());
        }


        int q=sc.nextInt();
        while(q-->0){
            int a= sc.nextInt();
            //fetch
            if(mpp.containsKey(a)){
                System.out.println(mpp.get(a));
            }else{
                System.out.println(0);
            }
        }


    }
}
