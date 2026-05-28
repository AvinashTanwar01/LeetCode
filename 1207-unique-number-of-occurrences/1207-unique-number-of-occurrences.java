class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        } 
        HashSet<Integer> unique = new HashSet<>();
        for(int a:map.values()){
            if(!unique.add(a)) return false;
        }
        return true;
    }
}