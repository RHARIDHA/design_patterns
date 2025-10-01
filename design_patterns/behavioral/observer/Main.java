public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserver("Observer1"));
        subject.addObserver(new ConcreteObserver("Observer2"));

        subject.setState(10);
        subject.setState(20);
    }
}
