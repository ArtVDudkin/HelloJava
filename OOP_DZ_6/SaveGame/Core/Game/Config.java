package SaveGame.Core.Game;

public class Config {
    
    private int initCandies;// = 200;
    private int candiesByStep;// = 28;
    
    public Config() {
        super();
        setInitCandies(200);
        setCandiesByStep(28);
    }

    public int getInitCandies() {
        return initCandies;
    }

    public void setInitCandies(int value) {
        this.initCandies = value;
    }

    public  int getCandiesByStep() {
        return candiesByStep;
    }

    public void setCandiesByStep(int value) {
        this.candiesByStep = value;
    }

}
