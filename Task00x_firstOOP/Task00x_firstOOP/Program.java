package Task00x_firstOOP;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    
    public static void OutputClear() {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void OutputData(String data) {
        data += "\n";
        System.out.print(data);
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write(data);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        OutputClear();
        
        OutputData("Products:");
        Product pr1 = new Product();
        OutputData(pr1.toString());

        OutputData("1. Food:");
        Food fd1 = new Food("Butter", 1.5, 8, "pcs", "18.06.2022");
        OutputData(fd1.toString());

        OutputData("2. Drinks:");
        Drink dr1 = new Drink("Coca-cola", 2.5, 10, "pcs", 0.5);
        OutputData(dr1.toString());

        OutputData("3. Hygiene suppies:");
        HygieneSup hg1 = new HygieneSup("Cotex", 2.15, 2, "pcs", 50);
        OutputData(hg1.toString());

        OutputData("4. Baby products:");
        BabysProd bb1 = new BabysProd("MickeyMouse", 4.25, 3, "pcs", 5, "Yes");
        OutputData(bb1.toString());
        
        OutputData("5. Milk:");
        Milk mlk1 = new Milk("Burenka", 2.1, 10, "pcs", 0.95, 1.5, "20.06.2022");
        OutputData(mlk1.toString());

        OutputData("6. Lemonade:");
        Lemonade lmd1 = new Lemonade("Buratino", 1.5, 20, "pcs", 0.5);
        OutputData(lmd1.toString());

        OutputData("7. Bread:");
        Bread brd1 = new Bread("Borodinsky bread", 2.5, 18, "pcs", "18.06.2022", "non gluten");
        OutputData(brd1.toString());

        OutputData("8. Eggs:");
        Eggs eg1 = new Eggs("Ryaba", 3.15, 22, "pcs", "30.06.2022", 10);
        OutputData(eg1.toString());

        OutputData("9. Mask:");
        Mask msk1 = new Mask("Medicine mask", 1.1, 4, "pcs", 100);
        OutputData(msk1.toString());

        OutputData("10. Toilet paper:");
        ToiletPaper tp1 = new ToiletPaper("Papia", 3.25, 20, "pcs", 4, 4);
        OutputData(tp1.toString());

        OutputData("11. Diapers:");
        Diaper diap1 = new Diaper("Huggies", 4.25, 20, "pcs", 50, 2, 1.5, 2.0, "Pants");
        OutputData(diap1.toString());

        OutputData("12. Baby pacifiers (soska):");
        Pacifier pcf1 = new Pacifier("Baby Pacifier", 1.25, 3, "pcs", 0, "Yes");
        OutputData(pcf1.toString());
    }
}