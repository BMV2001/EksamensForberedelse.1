package mønstre.strategy;

public class DuckClient {
    private StrategyQuackI behavior;

    public DuckClient(StrategyQuackI behavior) {
        this.behavior = behavior;
    }

    public void changeBehavior(StrategyQuackI newQuack){
        behavior = newQuack;
    }

}
