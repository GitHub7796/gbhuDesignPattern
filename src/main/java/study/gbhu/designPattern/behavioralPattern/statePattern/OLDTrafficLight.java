package study.gbhu.designPattern.behavioralPattern.statePattern;

import study.gbhu.designPattern.behavioralPattern.strategyPattern.Strategy;

//错误的代码
public class OLDTrafficLight {
    String state = "red";

    public void switchToGreen() {
        if ("green".equals(state)) {
            System.out.println("已是绿灯");
        } else if ("red".equals(state)) {
            System.out.println("ERO!红灯不能转换为绿灯");
        } else if ("yellow".equals(state)) {
            state = "green";
            System.out.println("ok...绿灯亮");
        }
    }
    //...
}
