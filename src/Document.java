public class Document implements Comparable<Document>{
    private String name;
    private String phone;
    private String middleSchool;
    private int score;
    private int attendance;
    private int plusScore;
    private int total;
    private boolean pass;
    public void written(String name, String phone, String middleSchool, int score, int attendance, int plusScore){
        this.name = name;
        this.phone = phone;
        this.middleSchool = middleSchool;
        this.score = score;
        this.attendance = attendance;
        this.plusScore = plusScore;
        this.total = score + attendance + plusScore ;   //합불을 구하는 기준
//        System.out.println(total);
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getMiddleSchool(){
        return middleSchool;
    }

    public int getScore(){
        return score;
    }

    public int getAttendance(){
        return attendance;
    }

    public int getPlusScore(){
        return plusScore;
    }

    public boolean getPass(){
        return pass;
    }

    public void setPass(boolean pass){
        this.pass = pass;
    }


    @Override   //document와 this를 비교
    public int compareTo(Document document){    //객체의 compareTo()함수를 오버라이딩 하여 그 객체만의 정렬 조건을 원하는 대로 재정의하기 위해서 사용
        if (document.total < total){
            return 1;                       //document.total < total은 현재 객체인 total값이 더 크다는 것을 의미
        }                                   //따라서 현재객체가 document 객체보다 우선순위가 높다는 것을 나타내기 위해 1을 반환
        else if (document.total > total){
            return -1;                      //document.total > total은 현재 객체의 total 값이 더 작다는 것을 의미
        }                                   // 현재 객체가 document 객체보다 우선순위가 낮다는 것을 나타내기 위해 -1을 반환
        return 0;                           //두 조건에 해당하지 않을 경우, total 값이 동일하다는 것을 의미, 두 객체의 우선순위가 같다는 것을 나타내기 위해 0을 반환
    }
}
