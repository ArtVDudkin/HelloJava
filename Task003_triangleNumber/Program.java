import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program {
    
    public static Integer GetTriangleNumber (int num) {            
        return num*(num + 1)/2;
    }
  
    public static Integer GetData(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = br.readLine();
        try {
            int res = Integer.parseInt(str);
            return res; 
        } catch (NumberFormatException ex) {
            System.out.print("Invalid input " + str + " is not a number\n");
            OutputData(String.format("Invalid input %s is not a number", str));
        } finally {
            br.close();
        }
        return -1; 
    }

    public static void OutputData(String data) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(data);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) throws Exception {
        int n = GetData("input.txt");
            
        if (n < 1) {
            System.out.println("Error! Input value must be greater than 1");
            OutputData("Error! Input value must be greater than 1");
        }
        else {
            int Tn = GetTriangleNumber(n);
            System.out.println(Tn);
            OutputData(String.format("%d", Tn));
        }

    }
}