package Algorythm_DZ_2.Sort;

public class BubbleSort {

    public BubbleSort() {
    }

    public void sort(int[] arr) {
        boolean needSort;
        do {
            needSort = false;
            for(int i = 0; i < arr.length -1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    needSort = true;
                }   
            }
        } while(needSort);
    }
}
