package Task007_Ferzi;

import java.io.FileWriter;
import java.io.IOException;

public class Ferzi {
    static int count = 0;

    public static void placeNextFerz(int nextFerz, int[] desk) {
        int deskSize = desk.length;
        if (nextFerz == deskSize) {
            count++;
            OutputData(desk);
            return;
        }

        for (int i = 0; i < deskSize; i++) {
            desk[nextFerz] = i;
            if (canPlaceFerz(nextFerz, desk)) {
                placeNextFerz(nextFerz + 1, desk);
            }
        }
    }

    public static boolean canPlaceFerz(int n, int[] desk) {
        for (int i = 0; i < n; i++) {
            if (desk[i] == desk[n] || Math.abs(n - i) == Math.abs(desk[n] - desk[i])) {
                return false;
            }
        }
        return true;
    }

    public static void OutputData(int[] desk) {
        String data = String.format("Desk # %d\n", count);
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk.length; j++) {
                if (desk[i] == j) data += "1  ";
                else data += "0  ";
            }
            data += "\n";
        }
        data += "\n";
        System.out.print(data);
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write(data);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void OutputClear() {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        int deskSize = 8;
        int[] desk = new int[deskSize];
        OutputClear();
        placeNextFerz(0, desk);
    }
}