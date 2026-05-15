import java.util.*;
public class findDifference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        
       
        int[] hash = new int[26];

        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a'] += 1;
        }
        
 
        for(int i = 0; i < t.length(); i++){
            hash[t.charAt(i) - 'a'] += 1;
        }
        

        for(int i = 0; i < 26; i++){
            if(hash[i] == 1){
                char result = (char)(i + 'a');
                System.out.println(result);
                break;
            }
        }

    }
}