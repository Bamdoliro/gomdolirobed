import java.util.ArrayList;
import java.util.Collections;

public class School {
    private String name;
    private ArrayList<Document> documents = new ArrayList<Document>();  //private ArrayList<Document> documents = new ArrayList<Document>();는 School 클래스의 멤버 변수인 documents를 선언하고 초기화


    School(String name){
        this.name = name;
    }

    public void getDocument(Document document){
        documents.add(document);
        // 원서 저장 테스트 코드
//        System.out.println("이름 : " + document.getName());
    }

    /*원서 조회*/
    public void readDocuments(){
        System.out.println("--------------------원서 조회--------------------");
        Collections.sort(documents, Collections.reverseOrder());
        for(Document document : documents){
            System.out.printf("이름 : %s\n전화번호 : %s\n출신 중학교 : %s\n성적 : %d\n출결 : %d\n가산점 : %d\n\n",
                    document.getName(), document.getPhone(), document.getMiddleSchool(), document.getScore(),
                    document.getAttendance(), document.getPlusScore());
        }
        System.out.println("--------------------합격---------------------");
    }

    /*합불 결과*/
    public void passStudent(){
        for (Document document : documents) {
            //합격기준: score 70% + attendance 20% + pluseScore10% >= 80    -> 합격
            if (document.getScore() * 0.7 + document.getAttendance() * 0.2 + document.getPlusScore() * 0.1 >= 80) {
                document.setPass(true);
            }
        }
    }
}