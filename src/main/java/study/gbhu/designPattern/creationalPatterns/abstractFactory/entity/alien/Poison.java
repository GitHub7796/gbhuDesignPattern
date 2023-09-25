package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.MidClassUnit;

//毒液
public class Poison extends MidClassUnit {

    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液 坐标："+x+" "+y);

    }

    @Override
    public void attack() {
        System.out.println("毒液 喷射毒液，攻击力:"+attack);

    }
}
