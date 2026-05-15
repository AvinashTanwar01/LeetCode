import java.util.*;
public class charHash {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        //with map
        Map<Character,Integer> mpp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key =s.charAt(i);
            int freq=0;
            if(mpp.containsKey(key)) freq=mpp.get(key);
            freq++;
            mpp.put(key,freq);
        }
        //with hash
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }

        while(n-->0){
            char a = sc.next().charAt(0);
            System.out.println(hash[a-'a']);
            //with mapping
            if(mpp.containsKey(a)){
                System.out.println(mpp.get(a));
            }else{
                System.out.println(0);
            }
        }
    }
}
