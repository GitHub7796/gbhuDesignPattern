package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.LowClassUnit;

//海军陆战对员
public class Marine extends LowClassUnit {
    public Marine(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("海军陆战对员 坐标："+x+" "+y);
    }

    @Override
    public void attack() {
        System.out.println("海军陆战对员 进行射击，攻击力:"+attack);
    }
}
