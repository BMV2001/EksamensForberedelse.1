package mønstre.composit;

public class Leaf extends Component{

    public Leaf(String data) {
        super(data);
    }

    @Override
    public void print(){
        System.out.println(data);
    }

}
