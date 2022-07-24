package SaveGame.Core.Saver;

import SaveGame.Core.Game.Game;

public class Originator {
    // private String state;

    // public void setState(String state) {
    //     this.state = state;
    // }

    // public String getState() {
    //     return state;
    // }

    // public Memento saveState() {
    //     return new Memento(state);
    // }

    // public void restoreState(Memento memento) {
    //     this.state = memento.getState();
    // }

    private Game gameState;

    public void setState(Game gameState) {
        this.gameState = gameState;
    }

    public Game getState() {
        return gameState;
    }

    public Memento saveState() {
        return new Memento(gameState);
    }

    public void restoreState(Memento memento) {
        this.gameState = memento.getState();
    }
}