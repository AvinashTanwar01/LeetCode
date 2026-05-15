import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class KeyboardMap {
    public static void main(String[] args) {
        String[] words= {"Hello","Alaska","Dad","Peace"};
        String[] result= optimal(words);
        System.out.println(Arrays.toString(result));
    }

    public static String[] optimal(String[] words){
        List<String> result = new ArrayList<>();

        String[] rows= {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        int[] rMap= new int[26];
        for(int i=0;i<rows.length;i++){
            for(char c: rows[i].toCharArray()){
                rMap[c-'a']=i;
            }
        }

        for(String word:words){
            String lower= word.toLowerCase();
            int row= rMap[lower.charAt(0)-'a'];
            boolean sameRow= true;

            for(int i=1;i<lower.length();i++){
                if(rMap[lower.charAt(i)-'a']!= row){
                    sameRow=false;
                    break;
                }
            }
            if(sameRow) result.add(word);
        }

        return result.toArray(new String[0]);
    }
}
