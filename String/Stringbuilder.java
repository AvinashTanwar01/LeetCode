public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sh= new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            sh.append(ch);
        }
        System.out.println(sh.toString());
    }
}
