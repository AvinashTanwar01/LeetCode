class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int sum=-1;
        for( char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int d= c-'0';
                if(d>max){
                   sum=max;
                   max=d;
                }else if(d<max && d>sum){
                    sum=d;
                }
            }
        }
        return sum;
    }
}