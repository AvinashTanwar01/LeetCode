class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map1= new HashMap<>();
        int max1=-1;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(map1.containsKey(c)){
                max1= Math.max(max1,i-map1.get(c)-1);
            }else{
                map1.put(c,i);
            }
        }
        return max1;
    }
}