package study.gbhu.designPattern.behavioralPattern.chainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Approver staff = new Staff("张飞");
        staff.setNextApprover(
                new Manager("关羽").setNextApprover(
                        new CFO("刘备")
                )
        );
        staff.approve(8000);
    }
}
