package study.gbhu.designPattern.behavioralPattern.chainOfResponsibilityPattern;

public class CFO extends Approver{
    public CFO(String name) {
        super(name);
    }
    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过，CFO：" + name);
        } else {
            System.out.println("驳回申请，CFO"+name);
        }
    }
}
