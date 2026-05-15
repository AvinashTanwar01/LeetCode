public class stringtoint {
    public static void main(String[] args) {
     String s="1337c0d3";
     System.out.println(optimal(s));   
    }

    public static int optimal(String s){
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ') i++;

        int sign=1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }

        long num=0;
        while(i<n&& Character.isDigit(s.charAt(i))){
            num = num*10 +(s.charAt(i)-'0');
            if(sign*num>Integer.MAX_VALUE) return  Integer.MAX_VALUE;
            if(sign*num<Integer.MIN_VALUE) return  Integer.MIN_VALUE;
            i++;
        }
        return(int)(sign*num);
    }
}
