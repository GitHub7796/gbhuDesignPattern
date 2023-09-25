package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.HighClassUnit;

/**
 * 巨型战舰类
 */
public class Battleship extends HighClassUnit {
    public Battleship(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("巨型战舰类 坐标："+x+" "+y);
    }

    @Override
    public void attack() {
        System.out.println("巨型战舰类 进行激光炮打击，攻击力:"+attack);

    }
}
