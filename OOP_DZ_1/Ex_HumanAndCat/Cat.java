package Ex_HumanAndCat;

public class Cat {
    
    public String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    public String listenHuman(String value) {
        String res = "";
        if (value.contains("kis-kis")) {
            res += sayMeow();
            res += lookAtHuman();
            return res;
        } else if (value.contains(catName)) {
            res += sayMur();
            res += lookAtHuman();
            res += runToHuman();
            return res;
        } else
            return "";
    }

    public String sayMeow() {
        return "cat: Meow!";
    }

    public String sayMur() {
        return "cat: Mur-Mur-Mur!";
    }

    public String lookAtHuman() {
        return "\ncat: looks at human one time and do nothing";
    }

    public String runToHuman() {
        return "\ncat: runs to human and starts to wait something";
    }

}
