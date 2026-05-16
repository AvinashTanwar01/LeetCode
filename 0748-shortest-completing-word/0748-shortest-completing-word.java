class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freq= new int[26];
        for(char c : licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                freq[Character.toLowerCase(c)-'a']++;
            }
        }

        String result="";
        for(String word:words){
            int[] wor= new int[26];
            for(char c:word.toCharArray()){
                wor[c-'a']++;
            }

            if(isComplete(wor,freq)){
                if(result.isEmpty()|| word.length()<result.length()){
                    result= word;
                }
            }
           
        }
        return result;
    }

    private boolean isComplete(int[] wor,int[] freq){
        for(int i=0;i<26;i++){
            if(wor[i]<freq[i]){
                return false;
            }
        }
        return true;
    }
}