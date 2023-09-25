package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.Unit;

public abstract class HighClassUnit extends Unit {
    public HighClassUnit(int x, int y) {
        super(25, 30, 300, x, y);
    }
}
