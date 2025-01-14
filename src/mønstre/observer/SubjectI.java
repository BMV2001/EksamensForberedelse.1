package mønstre.observer;

public interface SubjectI {

    public void registerObserver(ConcreteObserver cb);

    public void removeObserver(ConcreteObserver cb);

    public void notifyObservers();

}
