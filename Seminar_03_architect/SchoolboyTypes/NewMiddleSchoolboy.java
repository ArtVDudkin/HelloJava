package Seminar_03.SchoolboyTypes;

import Seminar_03.Interfaces.IPassExamable;
import Seminar_03.Interfaces.IPlayable;

public class NewMiddleSchoolboy extends Schoolboy implements IPlayable, IPassExamable {

    public NewMiddleSchoolboy(String name) {
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    public void play() {
        System.out.println("Я играю в C#");
    }

    public void passExam() {
        System.out.println("Я сдаю переводные экзамены");
    }

}
