package mønstre.strategy;

public class OrganicQuack implements StrategyQuackI {
    @Override
    public void quack() {
        System.out.println("Organisk lyd");
    }
}
