public class reveline {
    public static void main(String[] args) {
        String s ="My name is Avinash";
        String a= optimal(s);
        System.out.println(a);
    }
    public static String optimal(String s){
        StringBuilder sb= new StringBuilder();
        String[] words= s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(new StringBuilder(words[i]).reverse());//for even reversing words
            if(i!=0) sb.append(" ");
        }
        return sb.toString();

    }
}
