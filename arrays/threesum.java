import java.util.*;

public class threesum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
         List<List<Integer>> ans = optimal(arr,n);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
    }

    public static List<List<Integer>> brute(int[] arr, int n){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans= new ArrayList<>(st);
        return ans;

    } 

    public static List<List<Integer>> better(int[] arr,int n){
        Set<List<Integer>> store= new HashSet<>();

        for(int i=0;i<n;i++){
            Set<Integer> st= new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third= -(arr[i]+arr[j]);
                if(st.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    store.add(temp);
                }
                st.add(arr[j]);
            }
        }
        List<List<Integer>> ans= new ArrayList<>(store);
        return ans;
    }

    public static List<List<Integer>> optimal(int[] arr,int n){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum= arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        return ans;
    }
}

