package Algorythm_DZ_1.Task_1;

public class Sum {

    private Integer result;

    public Sum() {
        this.result = 0;
    }

    public int getSum(Integer value) {
        
        this.result = 0;
        for (int i = 1; i <= value; i++) {
            this.result += i;
        } 
        return this.result;
    }
}