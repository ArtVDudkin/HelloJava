package Planner.Core.MVP;

import Planner.Core.Infrastructure.Notebook;

public interface View {
    int getCurrIndex();
    void setCurrIndex(int value);
    //
    void print(Notebook currentBook);
}
