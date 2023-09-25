package study.gbhu.designPattern.structuralPattern.bridgePattern;

public class SquareRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("□");//正方形
    }
}
