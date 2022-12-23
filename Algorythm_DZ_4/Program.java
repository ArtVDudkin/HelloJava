package Algorythm_DZ_4;

public class Program {

    public static void main(String[] args) {
        
        RedBlackTree tree = new RedBlackTree();
        tree.add(24);
        tree.add(5);
        
        TreePrinter.print(tree.getRoot(), "");
        tree.add(1);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");
        
        tree.add(15);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");
        
        tree.add(3);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");
        
        tree.add(8);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(13);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(16);
        System.out.println("-----------");
        TreePrinter.print(tree.getRoot(), "");
    }
}
