public class test {
    public static void main(String[] args) {
        Main.BSSM bssm = new Main.BSSM();
//      이밤돌이 공부를 잘할떄
        Main.Leebamdol leebamdol = new Main.Leebamdol();
        Main.Geumgomdol geumgomdol = new Main.Geumgomdol();

        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 200, 11, 0);
        geumgomdol.writeApplication("금곰돌", "010-2222-1111", "금돌중학교", 140, 18, 4);

        leebamdol.submitApplication(bssm);
        geumgomdol.submitApplication(bssm);

        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 110, 11, 4);
        leebamdol.submitApplication(bssm);

        bssm.sortApplicantsByGradeDescending();
        bssm.viewAllApplications();

        bssm.judgeApplicationStatus(leebamdol.getPhoneNumber());
        bssm.judgeApplicationStatus(geumgomdol.getPhoneNumber());

        bssm.viewApplicant(leebamdol.getName());

        bssm.viewApplicant(geumgomdol.getName());

//      금곰돌이 공부를 잘할떄
        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 140, 11, 0);

        geumgomdol.writeApplication("금곰돌", "010-2222-1111", "금돌중학교", 200, 18, 4);

        leebamdol.submitApplication(bssm);
        geumgomdol.submitApplication(bssm);

        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 110, 11, 4);
        leebamdol.submitApplication(bssm);

        bssm.sortApplicantsByGradeDescending();
        bssm.viewAllApplications();

        bssm.judgeApplicationStatus(leebamdol.getPhoneNumber());
        bssm.judgeApplicationStatus(geumgomdol.getPhoneNumber());

        bssm.viewApplicant(leebamdol.getName());

        bssm.viewApplicant(geumgomdol.getName());

//      둘 다 공부를 잘할떄
        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 200, 11, 0);

        geumgomdol.writeApplication("금곰돌", "010-2222-1111", "금돌중학교", 200, 18, 4);

        leebamdol.submitApplication(bssm);
        geumgomdol.submitApplication(bssm);

        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 110, 11, 4);
        leebamdol.submitApplication(bssm);

        bssm.sortApplicantsByGradeDescending();
        bssm.viewAllApplications();

        bssm.judgeApplicationStatus(leebamdol.getPhoneNumber());
        bssm.judgeApplicationStatus(geumgomdol.getPhoneNumber());

        bssm.viewApplicant(leebamdol.getName());

        bssm.viewApplicant(geumgomdol.getName());

//      둘 다 공부를 못할때
        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 100, 11, 0);

        geumgomdol.writeApplication("금곰돌", "010-2222-1111", "금돌중학교", 100, 18, 4);

        leebamdol.submitApplication(bssm);
        geumgomdol.submitApplication(bssm);

        leebamdol.writeApplication("이밤돌", "010-1111-2222", "밤돌중학교", 100, 11, 4);
        leebamdol.submitApplication(bssm);

        bssm.sortApplicantsByGradeDescending();
        bssm.viewAllApplications();

        bssm.judgeApplicationStatus(leebamdol.getPhoneNumber());
        bssm.judgeApplicationStatus(geumgomdol.getPhoneNumber());

        bssm.viewApplicant(leebamdol.getName());

        bssm.viewApplicant(geumgomdol.getName());
    }
}
