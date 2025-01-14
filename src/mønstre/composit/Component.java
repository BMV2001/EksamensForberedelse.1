package mønstre.composit;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Component {

    protected ArrayList<Component> dataStructure = new ArrayList<>();
    protected String data;

    public Component(String data) {
        this.data = data;
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public String getChild(Component key) {
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

}
