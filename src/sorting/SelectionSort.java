package sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] liste){
        for (int i = 0; i < liste.length - 1; i++){
            int currentMin = liste[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < liste.length; j++){
                if (currentMin > liste[j]){
                    currentMin = liste[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                liste[currentMinIndex] = liste[i];
                liste[i] = currentMin;
            }
        }
        return liste;
    }
}
