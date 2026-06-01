class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upperCount++;
        }
        return upperCount == word.length() 
            || upperCount == 0 
            || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}