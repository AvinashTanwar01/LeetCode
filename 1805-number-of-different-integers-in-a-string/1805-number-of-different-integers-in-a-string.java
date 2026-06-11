class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> count= new HashSet<>();
        int i=0;
        while(i<word.length()){
            if(!Character.isDigit(word.charAt(i))){
                i++;
                continue;
            }

            while(i<word.length()&& word.charAt(i)=='0'){
                i++;
            }

            StringBuilder sb= new StringBuilder();
            while(i<word.length() && Character.isDigit(word.charAt(i))){
                sb.append(word.charAt(i));
                i++;
            }
            count.add(sb.toString());
        }
        return count.size();
    }
}