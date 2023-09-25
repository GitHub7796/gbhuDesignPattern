package study.gbhu.designPattern.behavioralPattern.statePattern;

public class Yellow implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("ERO!黄灯不能变绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("ERO!已是黄灯");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        trafficLight.setState(new Red());
        System.out.println("ok...红灯亮");
    }
}
