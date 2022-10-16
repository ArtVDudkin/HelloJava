package Seminar_03.SchoolboyTypes;

import Seminar_03.Interfaces.IPlayable;

public class JuniorSchoolboy extends Schoolboy implements IPlayable {
    

    public JuniorSchoolboy(String name) {
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    public void play() {
        System.out.println("Я играю в игрушки");
    }

}
