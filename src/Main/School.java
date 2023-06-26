package Main;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private final String schoolName;
    private ArrayList<ApplicationForm> ApplicationForms = new ArrayList<ApplicationForm>(); //학교에 지원한 학생들을 정렬할 ArrayList 생성


    School(String schoolName){ this.schoolName = schoolName; }

    public void getApplicationForm(ApplicationForm ApplicationForm){
        ApplicationForms.add(ApplicationForm);
    }

    public void viewApplicationForm(){
        System.out.println("--------------------원서 조회--------------------");
        Collections.sort(ApplicationForms, Collections.reverseOrder());
        for(ApplicationForm ApplicationForm : ApplicationForms){
            System.out.printf("이름 : %s\n전화번호 : %s\n출신 중학교 : %s\n성적 : %d\n출결 : %d\n가산점 : %d\n총점 : %d\n\n",
                    ApplicationForm.getName(), ApplicationForm.getPhone(), ApplicationForm.getFromMS(), ApplicationForm.getIntGrade(),
                    ApplicationForm.getAttendance(), ApplicationForm.getPlusPoint(), ApplicationForm.getTotal());
        }
        System.out.println("------------------------------------------------");
    }

    public void passStudent(){
        for(ApplicationForm ApplicationForm : ApplicationForms){
            ApplicationForm.setPass(ApplicationForm.getTotal() >= 80);
        }
    }
}