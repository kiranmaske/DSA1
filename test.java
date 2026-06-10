import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Character> V1 = new Vector<>(); // Use Character (wrapper class) instead of char

        v1.add(1);
        v1.add(2);
        v1.add(3);
        V1.addElement('k'); // Example usage of V1


        System.out.println("Vector v1 is: " + v1);
        System.out.println("Vector V1 is: " + V1);
    }
}