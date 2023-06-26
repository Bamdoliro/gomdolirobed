public class API_Test {
    static class BSSM {
        static class Applicant {
            private String name;
            private String phoneNumber;
            private String middleSchool;
            private int grade;
            private int attendance;
            private int addition;


//          S: API
            public void setName(String name) {this.name = name;}

            public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

            public void setMiddleSchool(String middleSchool) {this.middleSchool = middleSchool;}

            public void setGrade(int grade) {this.grade = grade;}

            public void setAttendance(int attendance) {this.attendance = attendance;}

            public void setAddition(int addition) {this.addition = addition;}

            public void setIntegrated // 통합본
                    (String name, String phoneNumber, String middleSchool, int grade, int attendance, int addition) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.middleSchool = middleSchool;
                this.grade = grade;
                this.attendance = attendance;
                this.addition = addition;
            }

            public String getName() {return name;}

            public String getPhoneNumber() {return phoneNumber;}

            public String getMiddleSchool() {return middleSchool;}

            public int getGrade() {return grade;}

            public int getAttendance() {return attendance;}

            public int getAddition() {return addition;}
//          E: API

        }
    }

    public static void main(String[] args) {

        BSSM.Applicant applicant = new BSSM.Applicant();

//      S: Test.Test
        String name = "강시우";
        String phoneNumber = "010-5357-****";
        String middleSchool = "Gyeongnam middle school";
        int grade = 110;
        int attendance = 18;
        int addition = 0;

        applicant.setName(name);
        applicant.setPhoneNumber(phoneNumber);
        applicant.setMiddleSchool(middleSchool);
        applicant.setGrade(grade);
        applicant.setAttendance(attendance);
        applicant.setAddition(addition);

        if (applicant.getName().equals(name)) {
            System.out.println("name:\t\t\t ✔️");
        }else {
            System.out.println("name:\t\t\t ❌");
        }

        if (applicant.getPhoneNumber().equals(phoneNumber)) {
            System.out.println("phoneNumber:\t ✔️");
        }else {
            System.out.println("phoneNumber:\t ❌");
        }

        if (applicant.getMiddleSchool().equals(middleSchool)) {
            System.out.println("middleSchool:\t ✔️");
        }else {
            System.out.println("middleSchool:\t ❌");
        }

        if (applicant.getGrade() == grade) {
            System.out.println("grade:\t\t\t ✔️");
        }else {
            System.out.println("grade:\t\t\t ❌");
        }

        if (applicant.getAttendance() == attendance) {
            System.out.println("attendance:\t\t ✔️");
        }else {
            System.out.println("attendance:\t\t ❌");
        }
        if (applicant.getAddition() == addition) {
            System.out.println("addition:\t\t ✔️");
        }else {
            System.out.println("addition:\t\t ❌");
        }

        applicant.setIntegrated
                (name + " a", phoneNumber + " a", middleSchool + " a", grade+1,
                        attendance+1, addition+1);
        System.out.println("\nchange all\n");

        if (applicant.getName().equals(name)) {
            System.out.println("name:\t\t\t ✔️");
        }else {
            System.out.println("name:\t\t\t ❌");
        }

        if (applicant.getPhoneNumber().equals(phoneNumber)) {
            System.out.println("phoneNumber:\t ✔️");
        }else {
            System.out.println("phoneNumber:\t ❌");
        }

        if (applicant.getMiddleSchool().equals(middleSchool)) {
            System.out.println("middleSchool:\t ✔️");
        }else {
            System.out.println("middleSchool:\t ❌");
        }

        if (applicant.getGrade() == grade) {
            System.out.println("grade:\t\t\t ✔️");
        }else {
            System.out.println("grade:\t\t\t ❌");
        }

        if (applicant.getAttendance() == attendance) {
            System.out.println("attendance:\t\t ✔️");
        }else {
            System.out.println("attendance:\t\t ❌");
        }
        if (applicant.getAddition() == addition) {
            System.out.println("addition:\t\t ✔️");
        }else {
            System.out.println("addition:\t\t ❌");
        }
//      E: Test.Test

    }
}
