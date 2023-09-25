package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.Unit;

public abstract class LowClassUnit extends Unit {
    public LowClassUnit(int x, int y) {
        super(5, 2, 35, x, y);
    }
}
