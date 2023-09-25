package study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.HighClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.LowClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.MidClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien.Mammoth;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien.Poison;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.alien.Roach;

public class AlienFactory implements AbtractFactory {
    private int x;
    private int y;

    public AlienFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Roach(x, y);
        System.out.println("制造 蟑螂兵");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Poison(x, y);
        System.out.println("制造 毒液兵");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Mammoth(x, y);
        System.out.println("制造 猛犸巨兽");
        return unit;
    }
}
