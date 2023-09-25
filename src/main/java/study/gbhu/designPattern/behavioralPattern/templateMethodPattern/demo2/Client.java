package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo2;

public class Client {
    public static void main(String[] args) {
        PM pm = new HRProject();
        pm.kickoff();

        pm = new APIProject();
        pm.kickoff();
    }
}
