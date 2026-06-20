class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split(" +");
        int j=0;
        int extra,spaceBetween;
        int countSpaces=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                countSpaces++;
            }
        }
         if (words.length == 1) {
            spaceBetween = 0;
            extra = countSpaces;
        } else {
            spaceBetween = countSpaces / (words.length - 1);
            extra = countSpaces % (words.length - 1);
        }
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(words[i]);
            if (i < words.length - 1) {
                res.append(" ".repeat(spaceBetween)); 
            }
        }
        res.append(" ".repeat(extra)); 

        return res.toString();
    }
}