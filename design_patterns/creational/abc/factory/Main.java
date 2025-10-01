public class Main {
    public static void main(String[] args) {
        Product productA = Factory.getProduct("A");
        productA.showType();

        Product productB = Factory.getProduct("B");
        productB.showType();
    }
}
