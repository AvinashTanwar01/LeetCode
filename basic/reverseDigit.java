// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class reverseDigit {
    public static void main(String[] args){
        int num= 898900;
        int revN=0;
        //using to check whether this is in limit of integer or not 
        int maxLimit = Integer.MAX_VALUE/10;
        int minLimit = Integer.MIN_VALUE/10;
        while(num!=0){
            int lastD = num %10;
            num = num/10;
            if(revN>maxLimit){
                System.out.println(0);
            }
            if(revN<minLimit){
                System.out.println(0);
            }
            revN = (revN * 10) + lastD;
        }
        System.out.println(revN);
    }
}
