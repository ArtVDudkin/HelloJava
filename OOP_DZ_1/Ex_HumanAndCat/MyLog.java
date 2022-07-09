package Ex_HumanAndCat;

import java.util.ArrayList;

public class MyLog {
    
    public ArrayList<String> catLog = new ArrayList<String>();
    
    public void appendToLog(String event) {
        catLog.add(event);
    }

    public void viewEvents() {
        for (var item : catLog){
            System.out.println(item);
        }
    }
}
