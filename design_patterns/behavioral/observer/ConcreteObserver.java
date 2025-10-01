public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(int newState) {
        System.out.println(name + " received update: " + newState);
    }
}
