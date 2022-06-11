import java.util.Random;

public class programHeapSort {
  
    public static Random rand = new Random();
    public static boolean flag;

    public static int[] FillArrayRandomly(int[] arr, int minValue, int maxValue) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((maxValue - minValue) + 1) + minValue;
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static int[] HeapSort(int arr[]) {
        int arrLen = arr.length;

        for (int i = arrLen / 2 - 1; i >= 0; i--) {
            buildHeap(arr, arrLen, i);
        }
   
        for (int i = arrLen - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            buildHeap(arr, i, 0);
        }
        
        return arr;
    }

    public static void buildHeap(int arr[], int arrLen, int i) {
        int rootElement = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (flag == true) {
            if (l < arrLen && arr[l] > arr[rootElement])
                rootElement = l;
            if (r < arrLen && arr[r] > arr[rootElement])
                rootElement = r;   
        } else {
            if (l < arrLen && arr[l] < arr[rootElement])
                rootElement = l;
            if (r < arrLen && arr[r] < arr[rootElement])
                rootElement = r;    
        }
        if (rootElement != i) {
            int swap = arr[i];
            arr[i] = arr[rootElement];
            arr[rootElement] = swap;
            buildHeap(arr, arrLen, rootElement);
        }
    }

    public static void main(String args[]) {
        int size = 20;
        int minValue = 1;
        int maxValue = 100;
        flag = true;       // true = по возрастанию, false = по убыванию
        int[] initArr = new int[size];
        int[] sortedArr = new int[size];
        initArr = FillArrayRandomly(initArr, minValue, maxValue);
        System.out.println("Initial array:");
        PrintArray(initArr);

        System.out.println("Sorted array:");
        sortedArr = HeapSort(initArr);  
        PrintArray(sortedArr);
    }
}