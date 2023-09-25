package study.gbhu.designPattern.behavioralPattern.chainOfResponsibilityPattern;

public abstract class Approver {
    protected String name;//审批人姓名
    protected Approver nextApprover;//下一个审批人

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;//链式调用
    }

    public abstract void approve(int amount);
}
