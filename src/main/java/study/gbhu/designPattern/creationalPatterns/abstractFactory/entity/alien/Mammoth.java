package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.HighClassUnit;

//猛犸类
public class Mammoth extends HighClassUnit {

    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸类 坐标："+x+" "+y);
    }

    @Override
    public void attack() {
        System.out.println("猛犸类 用牙顶，攻击力:"+attack);
    }
}
