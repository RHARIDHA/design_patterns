public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        additionalBehavior();
    }

    private void additionalBehavior() {
        System.out.println("Decorator A additional behavior");
    }
}
