package study.gbhu.designPattern.creationalPatterns.factoryPattern;

public class AirPlane extends Enemy{
    public AirPlane(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制飞机，出现坐标"+x+","+y);
    }
}
