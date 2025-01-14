package mønstre.strategy;

public class RoboQuack implements StrategyQuackI {
    @Override
    public void quack() {
        System.out.println("Metal lyd");
    }
}
