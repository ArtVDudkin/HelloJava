package Algorythm_DZ_2.Search;

public class BinarySearch {
    
    public BinarySearch() {
    }

    public int find(int[] arr, int value) {
        int left = 0;
        int right = arr.length -1;
        while(right - left >1) {
            int middle = (left + right) / 2;
            if(arr[middle] < value) {
                left = middle;
            } else {
                right = middle;
            }
        }
        if(arr[left] == value) {
            return left;
        }
        if(arr[right] == value) {
            return right;
        }
        return -1;
    }
}
