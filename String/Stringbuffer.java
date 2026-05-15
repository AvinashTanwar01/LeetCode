public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("I am Avinash");
        sb.insert(1," hello ");
        sb.delete(3,4);

        System.out.println(sb.toString());
    }
}
