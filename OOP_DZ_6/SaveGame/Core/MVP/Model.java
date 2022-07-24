package SaveGame.Core.MVP;

import SaveGame.Core.Game.Game;
import SaveGame.Core.Saver.Caretaker;
import SaveGame.Core.Saver.Originator;

public class Model {

    private Game currentGame;
    private Originator originator;
    private Caretaker caretaker;

    public Model() {
        currentGame = new Game();
        originator = new Originator();
        caretaker = new Caretaker();
        originator.setState(currentGame);
    }

    public void save() {
        originator.setState(currentGame);
        caretaker.setMemento(originator.saveState());
    }

    public void load() {
        if (caretaker.getMemento() != null) {
            originator.restoreState(caretaker.getMemento());
            currentGame = originator.getState();
        }
    }

    public void clear() {
        currentGame = new Game();
        originator = new Originator();
        caretaker = new Caretaker();
    }

    public Game getCurrentGame() {
        return this.currentGame;
    }
    
}