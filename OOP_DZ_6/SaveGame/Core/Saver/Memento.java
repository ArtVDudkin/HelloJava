package SaveGame.Core.Saver;

import SaveGame.Core.Game.Game;

public class Memento {
    // private final String state;

    // public Memento(String state) {
    //     this.state = state;
    // }

    // public String getState() {
    //     return state;
    // }

    private final Game gameState;

    public Memento(Game gameState) {
        this.gameState = gameState;
    }

    public Game getState() {
        return gameState;
    }
}