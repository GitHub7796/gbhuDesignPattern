package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.Unit;

public abstract class MidClassUnit extends Unit {
    public MidClassUnit(int x, int y) {
        super(10, 8, 80, x, y);
    }
}
