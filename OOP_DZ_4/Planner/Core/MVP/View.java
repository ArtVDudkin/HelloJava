package Planner.Core.MVP;

import Planner.Core.Infrastructure.Notebook;

public interface View {
    void showMenu(int menu);
    void refresh();
    void setCurrIndex(int value);
    void print(Notebook currentBook);
    String inputText(String text);
}
