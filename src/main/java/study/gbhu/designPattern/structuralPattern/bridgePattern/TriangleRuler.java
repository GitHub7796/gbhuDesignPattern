package study.gbhu.designPattern.structuralPattern.bridgePattern;

public class TriangleRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("△");
    }
}
