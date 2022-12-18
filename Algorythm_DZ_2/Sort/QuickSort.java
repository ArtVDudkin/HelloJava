package Algorythm_DZ_2.Sort;

public class QuickSort {
    
    public QuickSort() {
    }

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    public void quickSort(int[] arr, int startPos, int endPos) {
        int left = startPos;
        int right = endPos;
        int pivot = arr[(startPos + endPos) / 2];
        do {
            while(arr[left] < pivot) {
                left++;
            }
            while(arr[right] > pivot) {
                right--;
            }
            if(left <= right) {
                if(left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;
            }
        } while(left <= right);
        if(left <= endPos) {
            quickSort(arr, left, endPos);
        }
        if(right > startPos) {
            quickSort(arr, startPos, right);
        }
    }

}
