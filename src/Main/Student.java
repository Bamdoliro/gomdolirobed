package Main;

import Main.School;

public class Student {
    String name, phoneNumber, fromMS;
    private char grade;
    private int attend, point, totalScore;
    private int chance = 1;
    School bssm = new School("부산소프트웨어마이스터고등학교");

    Student(String name, String phoneNumber, String fromMS){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.fromMS = fromMS;
    }

    public void setApplicationForm(char grade, int attend, int point){
        switch (grade) {
            case 'A' -> this.totalScore = 80 + (attend / 10) + (point * 10);
            case 'B' -> this.totalScore = 70 + (attend / 10) + (point * 10);
            case 'C' -> this.totalScore = 60 + (attend / 10) + (point * 10);
            case 'D' -> this.totalScore = 50 + (attend / 10) + (point * 10);
            case 'E' -> this.totalScore = 40 + (attend / 10) + (point * 10);
        }
//        System.out.printf("%s의 totalScore: %d\n", name, totalScore);
    }

    public void submitApplicationForm(){
        if(chance > 0){
            System.out.printf("%s님, 원서가 성공적으로 접수 되었습니다.\n", name);
            chance --;
        }
        else {
            System.out.print("원서는 한 번만 제출할 수 있습니다.");
        }
    }
}