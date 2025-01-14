package mønstre.composit;

public class Composit extends Component {

    public Composit(String data) {
        super(data);
    }

    @Override
    public void add(Component component) {
        dataStructure.add(component);
    }

    @Override
    public void remove(Component component) {
        dataStructure.remove(component);
    }

    @Override
    public String getChild(Component key) {
        for (Component comp : dataStructure){
            if (comp.equals(key)){
                return comp.data;
            }
            else {
                comp.getChild(key);
            }
        }
        return null;
    }

    @Override
    public void print(){
        System.out.println(data);
        dataStructure.forEach(component -> component.print());
    }

}
