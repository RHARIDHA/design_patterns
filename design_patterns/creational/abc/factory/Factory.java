public class Factory {
    public static Product getProduct(String type) {
        if ("A".equals(type)) return new ConcreteProductA();
        else if ("B".equals(type)) return new ConcreteProductB();
        return null;
    }
}
