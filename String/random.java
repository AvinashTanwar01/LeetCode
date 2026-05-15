import java.util.*;
public class random {
    public static void main(String[] args) {
        int n=20;
        StringBuffer s= generate(n);
        System.out.println(s.toString());
    }

    public static StringBuffer generate(int n){
        StringBuffer sb = new StringBuffer(n);
        Random random = new Random();
        for(int i=0;i<n;i++){
            int randomchar=97+(int)(random.nextFloat()*26);
            sb.append((char)randomchar);
        }

        return sb;
    }
}
