package Ex_HumanAndCat;

public class Cat {
    
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    public String listenHuman(String value) {
        StringBuilder res = new StringBuilder();
        
        if (value.contains("kis-kis")) {
            res.append(sayMeow());
            res.append(lookAtHuman());
            return res.toString();
        } else if (value.contains(catName)) {
            res.append(sayMur());
            res.append(lookAtHuman());
            res.append(runToHuman());
            return res.toString();
        } else {
            return "";
        }
    }

    public String sayMeow() {
        return "cat: Meow!";
    }

    public String sayMur() {
        return "cat: Mur-Mur-Mur!";
    }

    public String lookAtHuman() {
        return "\ncat: looks at human one time and do nothing...";
    }

    public String runToHuman() {
        return "\ncat: runs to human and starts to wait something...";
    }

}
