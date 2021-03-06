package ss21_behavioral_design_pattern.thuc_hanh.trien_khai_lop_observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
