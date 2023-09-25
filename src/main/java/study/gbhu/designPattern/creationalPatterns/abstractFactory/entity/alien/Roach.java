package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.LowClassUnit;

/**
 * 蟑螂
 */
public class Roach extends LowClassUnit {
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂 坐标："+x+" "+y);
    }

    @Override
    public void attack() {
        System.out.println("蟑螂 用瓜子挠，攻击力:"+attack);

    }
}
