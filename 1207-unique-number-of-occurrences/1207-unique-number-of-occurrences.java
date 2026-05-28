class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        } 
        Boolean found=true;
        List<Integer> unique = new ArrayList<>();
        for(int a:map.values()){
            if(unique.contains(a)){
                found=false;
                break;
            }
            unique.add(a);
        }

        return found;
    }
}