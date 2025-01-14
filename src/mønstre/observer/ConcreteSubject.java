package mønstre.observer;

import java.util.ArrayList;

public class ConcreteSubject implements SubjectI{

    private ArrayList<ConcreteObserver> dataStructure = new ArrayList<>();
    private String state;

    public void setState(String newState){
        state = newState;
        notifyObservers();
    }

    public String getState(){
        return state;
    }

    @Override
    public void registerObserver(ConcreteObserver cb) {
        dataStructure.add(cb);
    }

    @Override
    public void removeObserver(ConcreteObserver cb) {
        dataStructure.remove(cb);
    }

    @Override
    public void notifyObservers() { //push
    dataStructure.forEach(subject -> subject.update(this));
    }
}
