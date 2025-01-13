package sorting;

import java.util.List;

public class InsertionSort {
    public static int[] insertionSort(int[] liste){
        for (int i = 1; i < liste.length; i++){
            int currentElement = liste[i];
            int k;
            for (k = i - 1; k >= 0 && liste[k]>currentElement; k--){
                liste[k+1] = liste[k];
            }
            liste[k+1] = currentElement;
        }
        return liste;
    }
}
