package Precourse;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int[] {2, 5, 13, 7, 6, 4};
        int size = 6;
        double sum = 0;
        double avg = 0;
        int index = 0;

        while(index < size) {
            sum += numbers[index];
            index += 1;
        }

        avg = sum / size;
        System.out.println(avg);
    }
}