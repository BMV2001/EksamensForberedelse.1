package sorting;

import java.lang.invoke.CallSite;

public class MergeSort {
    public static void mergeSort(int[] liste){
        if (liste.length > 1){ //termineringsregl
            int[] firstHalf = new int[liste.length/2];
            System.arraycopy(liste, 0, firstHalf, 0, liste.length/2);
            mergeSort(firstHalf); //Rekkursion

            int secondHalfLength = liste.length - liste.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(liste, liste.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf); //Rekkursion

            merge(firstHalf, secondHalf, liste); //hjælpemetode
        }
    }

    private static void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0; // index for list1
        int current2 = 0; // index for list2
        int current3 = 0; // index for temp

        while (current1 < list1.length && current2 < list2.length){
            if(list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            }
            else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length){ //tømmer list1
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length){ //tømmer list2
            temp[current3++] = list2[current2++];
        }
    }
}
