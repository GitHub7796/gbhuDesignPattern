package study.gbhu.designPattern.creationalPatterns.factoryPattern;

public class Boos extends Enemy{
    public Boos(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制Boos，出现坐标"+x+","+y);
    }
}
