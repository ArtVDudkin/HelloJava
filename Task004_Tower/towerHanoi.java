import java.util.Scanner;

public class towerHanoi {
    
    public static void tower(int with, int on, int some, int count) {
        if (count > 0) {
            tower(with, some, on, count - 1);
            System.out.printf("Move disk %d from %d to %d\n", count, with, on);
            tower(some, on, with, count - 1);
        }    
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int with = 1;
            int on = 3;
            int some = 2;
            System.out.println("Input a count of disks to replace: ");
            int count = scan.nextInt();
            tower(with, on, some, count);
        } 

    }
}
