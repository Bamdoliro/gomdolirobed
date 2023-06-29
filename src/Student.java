public class Student {
    private String name;
    private String middleSchool;
    private Document document = new Document();
    private int count = 1;
    Student(String name, String middleSchool){
        this.name = name;
        this.middleSchool = middleSchool;
    }
    /*학생 원서 작성*/
    public void writeDocument(String phone, int score, int attendance, int plusScore){      //phone, score, attendance, plusScore 매개변수는 각각 학생의 전화번호, 성적, 출결 정보, 가산점을 나타spa
        if(count == 0){                                                                     //count == 0은 학생이 이미 원서를 작성하여 제출한 경우를 나타냄
            return;                                                                         //count 변수가 0인 경우, 즉 이미 원서를 작성한 상태라면 메서드 실행을 종료
        }
        document.written(name, phone, middleSchool, score, attendance, plusScore);          //조건에 해당하지 않는 경우, document.written(name, phone, middleSchool, score, attendance, plusScore)를 호출하여 document 객체의 written() 메서드를 통해 학생의 원서 정보를 작성
    }                                                                                       //written() 메서드에는 학생의 이름, 전화번호, 출신 중학교, 성적, 출결 정보, 가산점이 인자로 전달

    /*학생 원서 재체출*/
    public void sentDocument(School school){
        if(count > 0){                                          //count > 0은 학생이 원서를 아직 제출하지 않았을 경우를 나타냄. 즉, count변수가 1보다 큰 경우
            school.getDocument(document);                       //해당하는 경우,school.getDocument(document)를 호출하여 학교 객체의 getDocument() 메서드를 통해 학생의 원서를 학교에 제출
            System.out.println(name + "님 원서를 제출되었습니다."); //"이름 + '님 원서를 제출되었습니다." 메시지를 출력
            System.out.println();
            count--;                                            //count변수를 1감소
        }
        else{
            System.out.println("이미 원서가 제출되었습니다.");      //이미 원서를 제출한 경우, "이미 원서가 제출되었습니다." 메시지와 "이름 + '님 원서는 한 번만 제출할 수 있습니다." 메시지를 출력
            System.out.println( name + "님 원서는 한 번만 제출할 수 있습니다.");
        }
    }

    /*자신의 원서 상태 조회*/
    public void checkPass(){
        if(document.getPass()){                             //document.getPass()를 호출하여 학생의 합격 여부를 확인
            System.out.println(name + "님 합격하셨습니다");    // 합격한 경우, 즉 pass 변수가 true인 경우, "이름 + '님 합격하셨습니다" 메시지를 출력
        }
        else{
            System.out.println(name + "님 불합격하셨습니다");  //합격하지 않은 경우, 즉 pass 변수가 false인 경우, "이름 + '님 불합격하셨습니다" 메시지를 출력
        }
    }
}