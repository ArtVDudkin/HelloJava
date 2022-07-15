package Ex2_HumanAndCat;

import java.util.ArrayList;
import java.util.List;

public class MyLog {
    
    public List<String> catLog = new ArrayList<>();
    
    public void append(String event) {
        catLog.add(event);
    }

    public void viewEvents() {
        for (var item : catLog){
            System.out.println(item);
        }
    }
}
