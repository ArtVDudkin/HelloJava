package Algorythm_DZ_1.Task_3;

import java.util.ArrayList;
import java.util.List;

public class FindCombo {
    
    private List<String> result;

    public FindCombo() {
        this.result = new ArrayList<>(); 
    }

    public void findCombo(String alphabet, char[] word, int length) {
        if (length == word.length) {
            //System.out.printf("%s \n", new String(word));
            this.result.add(new String(word));
            return;
        }
        for (int i = 0; i < alphabet.length(); i++) {
            word[length] = alphabet.charAt(i);
            findCombo(alphabet, word, length + 1);
        }
    }

    public List<String> showCombo() {
        return this.result;
    }
}
