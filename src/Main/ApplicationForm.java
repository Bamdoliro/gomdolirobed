package Main;

public class ApplicationForm implements Comparable<ApplicationForm>{ //ApplicationForm의 정렬기준을 바꾸기 위해서 Compareable인터페이스 상속
    private String name, phoneNumber, fromMS;
    private int attendance, plusPoint, total;
    private Grade intGrade;
    private boolean pass;

    public void write(String name, String phoneNumber, String fromMS, char grade, int attendance, int plusPoint){ //원서를 작성하는 함수
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.fromMS = fromMS;
        this.attendance = attendance;
        this.plusPoint = plusPoint;
        this.intGrade = Grade.valueOf(String.valueOf(grade));
        this.total = intGrade.getValue() + (attendance / 10) + (plusPoint * 10);
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phoneNumber;
    }

    public String getFromMS(){
        return fromMS;
    }

    public int getIntGrade(){
        return intGrade.getValue();
    }

    public int getAttendance(){
        return attendance;
    }

    public int getPlusPoint(){
        return plusPoint;
    }

    public boolean getPass(){ return pass; }
    public int getTotal() { return total; }

    public void setPass(boolean pass){
        this.pass = pass;
    }

    @Override
    public int compareTo(ApplicationForm ApplicationForm){ //객체의 compareTo메서드를 오버라이딩하여 ApplicationForm객체만의 정렬 조건을 재정의
        if (ApplicationForm.total < total){ return 1; } //ApplicationForm.total을 기준으로 정렬하도록 함
        else if (ApplicationForm.total > total){ return -1; }
        return 0;
    }
}