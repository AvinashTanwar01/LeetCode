class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer> map = new HashMap<>();
        String[] words= (s1 + " "+ s2).split(" ");
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        ArrayList<String> res= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(map.get(words[i])==1){
                res.add(words[i]);
            }
        }

        return res.toArray(new String[0]);
    }
}