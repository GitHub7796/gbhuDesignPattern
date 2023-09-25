package study.gbhu.designPattern.creationalPatterns.abstractFactory.Factory;

import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.HighClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.LowClassUnit;
import study.gbhu.designPattern.creationalPatterns.abstractFactory.entity.MidClassUnit;
//抽象工厂
public interface AbtractFactory {
    LowClassUnit createLowClass();//制造初级兵种
    MidClassUnit createMidClass();//制造中级兵种
    HighClassUnit createHighClass();//制造高级兵种

}
