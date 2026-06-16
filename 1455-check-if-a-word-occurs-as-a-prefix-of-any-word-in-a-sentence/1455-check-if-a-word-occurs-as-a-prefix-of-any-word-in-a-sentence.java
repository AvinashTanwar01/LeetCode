class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] c= sentence.split(" ");;
        for(int i=0;i<c.length;i++){
            if(c[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;

    }
}