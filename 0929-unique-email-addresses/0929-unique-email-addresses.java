class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for(String email : emails){
            String[] words= email.split("@");
            String first= words[0];
            String last = words[1];
            if(first.contains("+")){
                first = first.substring(0,first.indexOf("+"));
            }
            first= first.replace(".","");

            unique.add(first+"@"+last);
        }
        return unique.size();
    }
}