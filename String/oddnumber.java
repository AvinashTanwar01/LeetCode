public class oddnumber {
    public static void main(String[] args) {
        String s = "45678";
        String a = optimal(s);
        System.out.println(a);
    }

    public static String optimal(String s){
        int n = s.length();
        int end= -1;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if((ch-'0')%2==1){
                end=i;
                break;
            }
        }

        if(end==-1) return "";

        int start=0;
        while(start<end && s.charAt(start)=='0'){
            start++;
        }
        return s.substring(start,end+1);
    }
}
