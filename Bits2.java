public class Bits2 {
    public static void main(String[] args) {
        int n=2; //0101
        int pos = 1;
        int bitmask = 1<<pos;

        if((bitmask | n)==0) {
            System.out.println("bit was zero");
        } else {
            System.err.println("bit was one");
        }
    }
}