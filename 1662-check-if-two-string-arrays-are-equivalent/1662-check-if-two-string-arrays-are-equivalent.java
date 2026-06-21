class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(String word:word1){
            sb.append(word);
        }
        for(String word:word2){
            sb1.append(word);
        }
        return sb.toString().equals(sb1.toString());

    }
}