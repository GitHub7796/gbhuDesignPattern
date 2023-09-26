package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class Repition implements Expression{
    private int loopCount;
    private Expression loopBodySequence;

    public Repition(int loopCount, Expression loopBodySequence) {
        this.loopCount = loopCount;
        this.loopBodySequence = loopBodySequence;
    }

    @Override
    public void interpret() {
        while (loopCount > 0) {
            loopBodySequence.interpret();
            loopCount--;
        }
    }
}
