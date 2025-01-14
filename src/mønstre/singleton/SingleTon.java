package mønstre.singleton;

public class SingleTon {

    private SingleTon uniqueInstance;

    private SingleTon() {
        uniqueInstance = this;
    }

    public SingleTon getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new SingleTon();
            return uniqueInstance;
        }
        else {
            return uniqueInstance;
        }
    }
}
