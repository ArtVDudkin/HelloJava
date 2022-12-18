package Algorythm_DZ_2.Sort;

public class MergeSort {
    
    public MergeSort() {
    }

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length -1);
    }

    public void mergeSort(int[] arr, int startPos, int endPos) {
        if(startPos == endPos) {
            return;
        }
        int midPos = (startPos + endPos) / 2;
        mergeSort(arr, startPos, midPos);
        mergeSort(arr, midPos +1, endPos);
        int[] buff = new int[arr.length];
        int i = startPos;
        int j = midPos +1;
        int pos = startPos;
        while(i <= midPos && j <= endPos) {
            if(arr[i] < arr[j]) {
                buff[pos] = arr[i];
                i++;
                pos++;
            } else {
                buff[pos] = arr[j];
                j++;
                pos++;
            }
        }
        while(i <= midPos) {
            buff[pos] = arr[i];
            i++;
            pos++;
        }
        while(j <= endPos) {
            buff[pos] = arr[j];
            j++;
            pos++;
        }
        for(int k = startPos; k <= endPos; k++) {
            arr[k] = buff[k];
        }
    }

}
