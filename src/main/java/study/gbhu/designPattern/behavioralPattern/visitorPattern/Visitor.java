package study.gbhu.designPattern.behavioralPattern.visitorPattern;

public interface Visitor {
    public void visit(Candy candy);
    public void visit(Wine wine);
    public void visit(Fruit fruit);
}
