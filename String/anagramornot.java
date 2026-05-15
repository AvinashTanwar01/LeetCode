public class anagramornot {
    public static void main(String[] args){
        String s="car";
        String t="rac";
        System.out.println(optimal(s,t));
    }

    public static boolean optimal(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] hash= new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
            hash[t.charAt(i)-'a']--;
        }
        for(int i:hash){
            if(i!=0) return false;
        }
        return true;
    }
}
