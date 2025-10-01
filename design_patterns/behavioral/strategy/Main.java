public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.run();

        context.setStrategy(new ConcreteStrategyB());
        context.run();
    }
}
