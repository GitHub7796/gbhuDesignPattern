package study.gbhu.designPattern.behavioralPattern.strategyPattern;

public class Subtraction implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
