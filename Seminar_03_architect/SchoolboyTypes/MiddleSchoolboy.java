package Seminar_03.SchoolboyTypes;

import Seminar_03.Interfaces.IPassExamable;
import Seminar_03.Interfaces.IPlayable;
import Seminar_03.Interfaces.ISmokeble;

public class MiddleSchoolboy extends Schoolboy implements ISmokeble, IPlayable, IPassExamable {

    public MiddleSchoolboy(String name) {
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    public void play() {
        System.out.println("Я играю в Dota");
    }

    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    public void passExam() {
        System.out.println("Я сдаю переводные экзамены");
    }

}
