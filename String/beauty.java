public class beauty {
    public static void main(String[] args){
        String s="aabcbaa";
        System.out.println(optimal(s));
    }

    public static int optimal(String s){
        int n =s.length();
        int total =0;
        for(int i=0;i<n;i++){
            int[] freq= new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min, freq[k]);
                        max=Math.max(max, freq[k]);
                    }
                }
                total+=max-min;
            }
        }
        return total;
    }
}
