package school;

import application.AlreadySubmittedException;
import application.Application;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final String name;
    private final List<Application> applicationList = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveApplication(Application application) {
        try {
            validateApplication(application);
            applicationList.add(application);
            application.submitted();
            returnApplication(application);
            System.out.println("원서가 정상적으로 제출되었습니다.");
        } catch (AlreadySubmittedException e){
            System.out.println("원서는 한 번만 제출할 수 있습니다.");
        }
    }

    private void returnApplication(Application application) {
        application.getApplicant().receiveApplication(application);
    }

    private void validateApplication(Application application) {
        for (Application submmitedApplication : applicationList) {
            if (submmitedApplication.getApplicant().equals(application.getApplicant())) {
                throw new AlreadySubmittedException();
            }
        }
    }

    public void printApplicationByScore() {
        System.out.println();
        System.out.println("< " + name + " 원서 접수 현황 >");
        System.out.println("==========================================");
        System.out.println("|  이 름  |     전화번호     | 출신중학교 | 총점 |");
        System.out.println("------------------------------------------");
        applicationList.stream()
                .sorted((a1, a2) -> a2.getTotalScore() - a1.getTotalScore())
                .forEach(System.out::println);
        System.out.println("==========================================");
        System.out.println();
    }

    public void handleApplication() {
        applicationList.stream()
                .filter(application -> application.getTotalScore() >= 300)
                .forEach(Application::pass);
        applicationList.stream()
                .filter(application -> application.getTotalScore() < 300)
                .forEach(Application::fail);
    }
}
