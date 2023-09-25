package study.gbhu.designPattern.creationalPatterns.factoryPattern;

public class Tank extends Enemy{

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制坦克，出现坐标"+x+","+y);
    }
}
