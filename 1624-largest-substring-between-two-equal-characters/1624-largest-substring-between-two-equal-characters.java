class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max1=-1;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i+1;j--){
                if(s.charAt(i)==s.charAt(j)){
                    max1=Math.max(max1,j-i-1);
                    break;
                }
            }
        }
        return max1;
    }
}