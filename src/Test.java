import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static class BSSM {
        static class Applicant {
            private String name;
            private String phoneNumber;
            private String middleSchool;
            private int grade;
            private int attendance;
            private int addition;


            public Applicant(String name, String phoneNumber, String middleSchool,
                             int grade, int attendance, int addition) { //
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.middleSchool = middleSchool;
                this.grade = grade;
                this.attendance = attendance;
                this.addition = addition;
            }

//          S: API
            public void setName(String name) {
                this.name = name;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public void setMiddleSchool(String middleSchool) {
                this.middleSchool = middleSchool;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public void setAttendance(int attendance) {
                this.attendance = attendance;
            }

            public void setAddition(int addition) {
                this.addition = addition;
            }

            public String getName() {
                return name;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public String getMiddleSchool() {
                return middleSchool;
            }

            public int getGrade() {
                return grade;
            }

            public int getAttendance() {
                return attendance;
            }

            public int getAddition() {
                return addition;
            }
            //          E: API

        }
    }

    public static void main(String[] args) {
        BSSM bssm = new BSSM();
    }
}
