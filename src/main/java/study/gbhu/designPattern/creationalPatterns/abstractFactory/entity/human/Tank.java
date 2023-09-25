package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.MidClassUnit;

/**
 * 坦克
 */
public class Tank extends MidClassUnit {

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克 坐标："+x+" "+y);
    }

    @Override
    public void attack() {
        System.out.println("坦克 进行轰击，攻击力:"+attack);

    }
}
