package study.gbhu.designPattern.behavioralPattern.statePattern;

public class Red implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        trafficLight.setState(new Green());
        System.out.println("ok...绿灯亮");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("ERO!红灯不能转换为黄灯");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("ERO!已是红灯");
    }
}
