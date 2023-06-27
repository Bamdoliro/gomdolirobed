package Main;

public class Student {
    private final String name;
    private final String fromMS;
    private final String phoneNumber;
    private final ApplicationForm applicationForm = new ApplicationForm(); //학생 객체가 만들어질 때 마다 각자의 원서 객체를 생성함
    private int count = 1; //모든 학생들은 한 번만 원서를 제출할 수 있음

    Student(String name, String fromMS, String phoneNumber){
        this.name = name;
        this.fromMS = fromMS;
        this.phoneNumber = phoneNumber;
    }

    public void setApplicationForm(char grade, int attendance, int plusPoint){ //학생이 원서를 작성하는 함수
        if(count <= 0){
            return;
        }
        applicationForm.write(name, phoneNumber, fromMS, grade, attendance, plusPoint);
    }

    public void submitApplicationForm(School school){ //학생이 원서를 제출하는 함수
        if(count > 0){
            school.getApplicationForm(applicationForm); //학교 객체가 자신의 원서 객체를 조회할 수 있도록 저장함
            System.out.println(name + "님, 원서를 제출하셨습니다");
            count--;
        }
        else{
            System.out.println(name + "님, 원서는 한 번만 제출할 수 있습니다");
        }
    }

    public void checkPass(){
        if(applicationForm.getPass()){
            System.out.println(name + "님, 합격하셨습니다.");
        }
        else{
            System.out.println(name + "님, 불합격하셨습니다.");
        }
    }
}

