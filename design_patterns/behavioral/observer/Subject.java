import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setState(int value) {
        this.state = value;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
