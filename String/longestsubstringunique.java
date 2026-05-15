
import java.util.HashMap;
import java.util.Map;

public class longestsubstringunique {
    public static void main(String[] args){
        String s="abcabcbb";
        System.out.println(optimal(s));
    }

    public static int optimal(String s){
        int n = s.length();
        int maxlen=0;
        int left=0;
        Map<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            if(mpp.containsKey(c) && mpp.get(c)>=left){
                left=mpp.get(c)+1;
            }
            mpp.put(c, i);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
