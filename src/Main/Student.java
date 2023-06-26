package Main;

public class Student {
    private String name, fromMS, phoneNumber;
    private final ApplicationForm ApplicationForm = new ApplicationForm(); //학생 객체가 만들어질 때 마다 각자의 원서 객체를 생성함
    private int count = 1; //모든 학생들은 한 번만 원서를 제출할 수 있음
    Student(String name, String fromMS, String phoneNumber){ //생성자, 여기서는 이름과 중학교만 받음
        this.name = name;
        this.fromMS = fromMS;
        this.phoneNumber = phoneNumber;
    }
    public void setApplicationForm(char grade, int attendance, int plusPoint){ //학생이 원서를 작성하는 함수
        if(count <= 0){ //더 이상 남은 기회가 없다면 (작성만으로는 count가 차감되지 않으므로 작성은 여러번 가능하다)
            return; //아무것도 반환하지 않아서 메서드 종료
        }
        ApplicationForm.write(name, phoneNumber, fromMS, grade, attendance, plusPoint); //자신의 원서 객체에 인수로 뱓은것들을 보낸다.
        //여기서 name과 fromMS는 객체 변수, 나머지는 매개 변수임.
    }
    public void submitApplicationForm(School school){ //학생이 원서를 제출하는 함수
        if(count > 0){ //제출 횟수가 남았는지 확인
            school.getApplicationForm(ApplicationForm); //학교 객체가 자신의 원서 객체를 조회할 수 있도록 저장함
            System.out.println(name + "님, 원서를 제출하셨습니다");
            count--; //더 이상 작성, 또는 제출할 수 없도록 count횟수를 차감시킴.
        }
        else{
            System.out.println(name + "님, 원서는 한 번만 제출할 수 있습니다");
        }
    }

    public void checkPass(){
        if(ApplicationForm.getPass()){
            System.out.println(name + "님, 합격하셨습니다.");
        }
        else{
            System.out.println(name + "님, 불합격하셨습니다.");
        }
    }
}

