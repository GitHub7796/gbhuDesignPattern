package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class LeftKeyClick implements Expression{
    private LeftKeyDown leftKeyDown;
    private LeftKeyUP leftKeyUP;

    public LeftKeyClick() {
        this.leftKeyDown = new LeftKeyDown();
        this.leftKeyUP = new LeftKeyUP();
    }

    @Override
    public void interpret() {
        leftKeyDown.interpret();
        leftKeyUP.interpret();
    }
}
