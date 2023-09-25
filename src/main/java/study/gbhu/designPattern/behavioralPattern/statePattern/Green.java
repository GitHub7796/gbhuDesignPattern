package study.gbhu.designPattern.behavioralPattern.statePattern;

public class Green implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("ERO!已是绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("ok...黄灯亮");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("ERO!绿地不能变红");
    }
}
