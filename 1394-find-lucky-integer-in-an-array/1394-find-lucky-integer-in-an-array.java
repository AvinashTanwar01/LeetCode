class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> count= new HashMap<>();
        for(int a:arr){
            count.put(a,count.getOrDefault(a,0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer> map1: count.entrySet()){
            int present =0;
            if(map1.getKey().equals(map1.getValue())){
                present = map1.getKey();
                max= Math.max(max,present);
            }
        }
        return max;
    }
}