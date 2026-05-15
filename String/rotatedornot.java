public class rotatedornot {
    public static void main(String[] args){
        String s="abcde";
        String goal="cdeab";
        System.out.println(optimal(s,goal));
    }

    public static boolean optimal(String s , String goal){
        if(s.length()!=goal.length()) return false;
        String doubled= s+s;
        return doubled.contains(goal);
    }
}
