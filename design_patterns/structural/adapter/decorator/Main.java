public class Main {
    public static void main(String[] args) {
        Component baseComponent = new ConcreteComponent();
        Component decorated = new ConcreteDecoratorA(baseComponent);
        decorated.operation();
    }
}
