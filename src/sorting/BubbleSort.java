package sorting;

public class BubbleSort {

    public static int[] sort(int[] liste){
        for (int k = 1; k < liste.length; k++){
            for (int i = 0; i < liste.length-k; i++){
                if (liste[i] > liste[i +1]){
                    int temp = liste[i];
                    liste[i] = liste[i+1];
                    liste[i+1] = temp;
                }
            }
        }
    }
}
