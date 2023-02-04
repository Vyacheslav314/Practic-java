

public class MergeSort {

    
    public static void main(String[] args) {
        int[] array = {21, 12, 33, 22, 1, 77};
        MergeSort.mergeSort(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void mergeSort(int[] array, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] newArray = new int[mid];
        int[] newArray2 = new int[len - mid];
    
        for (int i = 0; i < mid; i++) {
            newArray[i] = array[i];
        }
        for (int i = mid; i < len; i++) {
            newArray2[i - mid] = array[i];
        }
        mergeSort(newArray, mid);
        mergeSort(newArray2, len - mid);
    
        merge(array, newArray, newArray2, mid, len - mid);
    }


    public static void merge(
    int[] array, int[] newArray, int[] newArray2, int left, int right) {
 
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < left && j < right) {
        if (newArray[i] <= newArray2[j]) {
            array[k] = newArray[i];
            k++;
            i++;
        }
        else {
            array[k] = newArray2[j];
            k++;
            j++;
        }
    }
    while (i < left) {
        array[k] = newArray[i];
        k++;
        i++;
    }
    while (j < right) {
        array[k] = newArray2[j];
        k++;
        j++;
    }
}
        
}
