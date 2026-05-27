class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for(int i=0;i<26;i++){
            rank[order.charAt(i)-'a']=i;
        }

       for(int i=0;i<words.length-1;i++){
        String w1= words[i];
        String w2= words[i+1];
        boolean found=false;

        for(int j=0;j<Math.min(w1.length(),w2.length());j++){
            if(rank[w1.charAt(j)-'a']<rank[w2.charAt(j)-'a']){
                found=true;
                break;
            }else if(rank[w1.charAt(j)-'a']>rank[w2.charAt(j)-'a']){
                return false;
            }
        }
         if (!found && w1.length() > w2.length()) return false;
       }
       return true;
    }
}