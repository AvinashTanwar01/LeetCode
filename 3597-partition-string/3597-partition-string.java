class Solution {
    public List<String> partitionString(String s) {
        List<String> unique = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        StringBuilder current= new StringBuilder();
        for(int i=0;i<s.length();i++){
            current.append(s.charAt(i));
            if(!seen.contains(current.toString())){
                unique.add(current.toString());
                seen.add(current.toString());
                current= new StringBuilder();
            }
        }
        if(current.length()>0 && !seen.contains(current.toString())){
            unique.add(current.toString());
        }

        return unique;
        
    }
}