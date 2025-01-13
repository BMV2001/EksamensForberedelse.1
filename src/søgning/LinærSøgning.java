package søgning;

public class LinærSøgning {

    public static <E extends Number> int linærSøgning (E[] list, E key){
        for (int i = 0; i < list.length; i++){
            if (list[i] == key){
                return (int) list[i];
            }
        }
        return 0;
    }
}
