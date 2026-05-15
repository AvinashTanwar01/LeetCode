public class goodnumber {
    static final int M = (int) (1e9 + 7);

    public static void main(String[] args) {
        long s = 1;
        System.out.println(find(s));
    }

    public static long find(long s) {
        return (pow(5, (s + 1) / 2) * pow(4, s / 2)) % M;
    }

    public static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = pow(a, b / 2);
        long result = (half * half) % M;
        if (b % 2 == 1) {
            result = (result * a) % M;
        }
        return result;
    }
}
