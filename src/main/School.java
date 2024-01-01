package main;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private final String schoolName;
    private final ArrayList<ApplicationForm> applicationForms = new ArrayList<>(); //학교에 지원한 학생들을 정렬할 ArrayList 생성


    School(String schoolName){ this.schoolName = schoolName; }

    public void getApplicationForm(ApplicationForm applicationForm){
        applicationForms.add(applicationForm);
    }


    public void viewApplicationForm(){
        System.out.println("--------------------원서 조회--------------------");
        Collections.sort(applicationForms, Collections.reverseOrder());
        for(ApplicationForm applicationForm : applicationForms){
            System.out.printf("이름 : %s\n전화번호 : %s\n출신 중학교 : %s\n성적 : %d\n출결 : %d\n가산점 : %d\n총점 : %d\n\n",
                    applicationForm.getName(), applicationForm.getPhone(), applicationForm.getFromMS(), applicationForm.getIntGrade(),
                    applicationForm.getAttendance(), applicationForm.getPlusPoint(), applicationForm.getTotal());
        }
        System.out.println("------------------------------------------------");
    }

    public void passStudent(){
        for(ApplicationForm applicationForm : applicationForms){
            applicationForm.setPass(applicationForm.getTotal() >= 80);
        }
    }
}