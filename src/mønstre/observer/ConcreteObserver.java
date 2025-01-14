package mønstre.observer;

public class ConcreteObserver implements ObserverI{

    private String data;

    @Override
    public void update(ConcreteSubject subject) {
        data = subject.getState();
        //Alternativt kan man have Subjektet liggende i en feltvariabel.
    }
}
