package SaveGame.UI;

import SaveGame.Core.MVP.View;


public class ConsoleView implements View {

    public ConsoleView(String msg) {
        print(msg);
    }            
                

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
    
    
}
