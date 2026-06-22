class Solution {
    public boolean canConvertString(String s, String t, int k) {
        int[] count= new int[26];
        int shift=0;
        int move=0;
        if (s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)==t.charAt(i))){
              shift=(t.charAt(i)-s.charAt(i)+26)%26;
                move= shift+26*count[shift];
                if(move>k) return false;
            count[shift]++;
            }
            
        }
        return true;
    }
}