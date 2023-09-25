package study.gbhu.designPattern.creationalPatterns.abstractFactory.entity;

/**
 * 抽象类
 */
public abstract class Unit {
    protected int attack;//攻击力
    protected int defence;//防御力
    protected int health;//生命值
    protected int x;//横坐标
    protected int y;//纵坐标

    public Unit(int attack, int defence, int health, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public abstract void show();
    public abstract void attack();
}
