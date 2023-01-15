package Task006_mergeSort;

import java.util.Random;

public class ProgramMergeSort {

    public static Random rand = new Random();

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

    public static int[] MergeSort(int[] arr, boolean flag) {
        int arrLength = arr.length;
        if (arrLength == 1)
            return arr;
        int middlePoint = arrLength / 2;
        int[] arrLeft = new int[middlePoint];
        int[] arrRight = new int[arrLength - middlePoint];
        for (int i = 0; i < arrLength; i++)
            if (i < middlePoint)
                arrLeft[i] = arr[i];
            else
                arrRight[i - middlePoint] = arr[i];
        return MergeArrays(MergeSort(arrLeft, flag), MergeSort(arrRight, flag), flag);
    }
 
    public static int[] MergeArrays(int[] arrLeft, int[] arrRight, boolean flag)
    {
        int a = 0, b = 0;
        int mergedArrLength = arrLeft.length + arrRight.length;
        int[] mergedArr = new int[mergedArrLength];
        if (flag) {
            for (int i = 0; i < mergedArrLength; i++) {
                if (b < arrRight.length && a < arrLeft.length)
                    if (arrLeft[a] > arrRight[b])
                        mergedArr[i] = arrRight[b++];
                    else
                        mergedArr[i] = arrLeft[a++];
                else
                    if (b < arrRight.length)
                        mergedArr[i] = arrRight[b++];
                    else
                        mergedArr[i] = arrLeft[a++];
            }
        } else {
            for (int i = 0; i < mergedArrLength; i++) {
                if (b < arrRight.length && a < arrLeft.length)
                    if (arrLeft[a] < arrRight[b])
                        mergedArr[i] = arrRight[b++];
                    else
                        mergedArr[i] = arrLeft[a++];
                else
                    if (b < arrRight.length)
                        mergedArr[i] = arrRight[b++];
                    else
                        mergedArr[i] = arrLeft[a++];
            }
        }
        return mergedArr;
    }
 
    public static void main(String[] args) throws Exception {
        int size = 20;
        int minValue = 1;
        int maxValue = 100;
        int[] initArr = new int[size];
        int[] sortedArr = new int[size];
        initArr = FillArrayRandomly(initArr, minValue, maxValue);
        System.out.println("Initial array:");
        PrintArray(initArr);
        
        System.out.println("Sorted array:");
        sortedArr = MergeSort(initArr, true); // true = по возрастанию, false = по убыванию 
        PrintArray(sortedArr);
    }

}