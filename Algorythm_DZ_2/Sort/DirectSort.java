package Algorythm_DZ_2.Sort;

public class DirectSort {

    public DirectSort() {
    }

    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            if(minPos != i) {
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }

}
