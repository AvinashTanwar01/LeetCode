import java.util.*;

public class RomanToI{
    public static void main(String[] args){
        String s = "MCMXCIV";
        int result = optimalCode(s);
        System.out.println(result);
    }

    public static int optimalCode(String s){
        int res=0;
        HashMap<Character,Integer> result = new HashMap<>();
        result.put('I',1);
        result.put('V',5);
        result.put('X',10);
        result.put('L',50);
        result.put('C',100);
        result.put('D',500);
        result.put('M',1000);

        for(int i=0;i<s.length()-1;i++){
            if(result.get(s.charAt(i))<result.get(s.charAt(i+1))){
                res-= result.get(s.charAt(i));
            }else{
                res+= result.get(s.charAt(i));
            }
        }
        return res + result.get(s.charAt(s.length()-1));
    }
}