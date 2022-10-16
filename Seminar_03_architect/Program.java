package Seminar_03;

import Seminar_03.Interfaces.IPassExamable;
import Seminar_03.Interfaces.IPlayable;
import Seminar_03.Interfaces.ISmokeble;
import Seminar_03.SchoolboyTypes.JuniorSchoolboy;
import Seminar_03.SchoolboyTypes.MiddleSchoolboy;
import Seminar_03.SchoolboyTypes.NewMiddleSchoolboy;
import Seminar_03.SchoolboyTypes.Schoolboy;
import Seminar_03.SchoolboyTypes.SeniorSchoolboy;

public class Program {
    
    public static void main(String[] args) {
        
        Schoolboy schoolboy1 = new JuniorSchoolboy("Альберт");
        Schoolboy schoolboy2 = new MiddleSchoolboy("Артем");
        Schoolboy schoolboy3 = new SeniorSchoolboy("Борис");
        Schoolboy schoolboy4 = new NewMiddleSchoolboy("Олег");
        
        showActions(schoolboy1);
        showActions(schoolboy2);
        showActions(schoolboy3);
        showActions(schoolboy4);

    }

    public static void showActions(Schoolboy person) {
        person.study();
        if(person instanceof IPlayable) {
            ((IPlayable) person).play();
        }

        if(person instanceof ISmokeble) {
            ((ISmokeble) person).smoke();
        }

        if(person instanceof IPassExamable) {
            ((IPassExamable) person).passExam();
        }

        System.out.println("-------");
    }
}
