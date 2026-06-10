interface Printable {
    void print();
}

class As implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        As obj = new As();
        obj.print();
    }
}