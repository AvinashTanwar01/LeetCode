import java.util.*;
public class majorit3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        hash(arr, n);
    }

    public static void hash(int[] arr,int n){
        int count = n/3;
        int[] hash = new int[n];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        for(int i=0;i<n;i++){
            if(hash[i]>count){
                System.out.print(i+" ");
            }
        }

    }

    public static void optimal(int[] arr , int n){
        int cnt1=0,cnt2=0;
        int ele1= Integer.MIN_VALUE;
        int ele2= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele1!=arr[i]){
                cnt1=1;
                ele1=arr[i];
            }
            else if(cnt2==0 && ele2!=arr[i]){
                cnt2=1;
                ele2=arr[i];
            }
            else if(ele1==arr[i]) cnt1++;
            else if(ele2==arr[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls= new ArrayList<>();
        // cnt1=0;
        // cnt2=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==ele1)cnt1++;
        //     if(arr[i]==ele2)cnt2++;
        // }

        int mini=(int)(n/3)+1;
        if(cnt1>=mini)ls.add(ele1);
        if(cnt2>=mini)ls.add(ele2);




    }
}
