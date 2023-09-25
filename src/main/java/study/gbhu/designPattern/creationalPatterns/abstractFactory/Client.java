package study.gbhu.designPattern.creationalPatterns.abstractFactory;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory.AbtractFactory;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory.AlienFactory;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory.HumanFactory;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.Unit;

public class Client {
    public static void main(String[] args) {
        System.out.println("game start");

        System.out.println("工人建造了工厂");
        AbtractFactory factory = new HumanFactory(10, 10);
        Unit marine = factory.createLowClass();
        marine.show();
        Unit tank = factory.createMidClass();
        tank.show();
        Unit ship = factory.createHighClass();
        ship.show();

        System.out.println("工蜂建造了外星怪兽工厂");
        factory = new AlienFactory(20, 20);
        Unit roach = factory.createLowClass();
        roach.show();
        Unit poison = factory.createMidClass();
        poison.show();
        Unit mammoth = factory.createHighClass();
        mammoth.show();

        System.out.println("开始大战");

        marine.attack();
        tank.attack();
        ship.attack();
        roach.attack();
        poison.attack();
        mammoth.attack();
    }
}
