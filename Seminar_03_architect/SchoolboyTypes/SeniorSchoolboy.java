package Seminar_03.SchoolboyTypes;

import Seminar_03.Interfaces.IPassExamable;

public class SeniorSchoolboy extends Schoolboy implements IPassExamable {
    
    public SeniorSchoolboy(String name) {
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }

    public void passExam() {
        System.out.println("Я сдаю выпускные экзамены");
    }
}
