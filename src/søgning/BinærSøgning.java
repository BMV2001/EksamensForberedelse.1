package søgning;

public class BinærSøgning{
    /**
     * @param list
     * @param key
     * @return the index in which the value was found. This method only works
     * on lists which has already been sorted in ascending order.
     */
    public static <E> int binærSøgning(E[] list, E key){
        int low = 0;
        int high = list.length -1;

        while (high >= low){
            int mid = (low + high) /2;
            if ((double) key < (double) list[mid]){
                high = mid - 1;
            }
            else if (key == list[mid]){
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -1; //if not found
    }
}
