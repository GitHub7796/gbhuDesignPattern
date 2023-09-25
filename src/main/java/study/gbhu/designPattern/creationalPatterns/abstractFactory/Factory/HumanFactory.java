package study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.HighClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.LowClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.MidClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human.Battleship;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human.Marine;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.human.Tank;

public class HumanFactory implements AbtractFactory{

    private int x;
    private int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Marine(x, y);
        System.out.println("制造 海军陆战队");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Tank(x, y);
        System.out.println("制造 坦克");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Battleship(x, y);
        System.out.println("制造 巨型战舰");
        return unit;
    }
}
