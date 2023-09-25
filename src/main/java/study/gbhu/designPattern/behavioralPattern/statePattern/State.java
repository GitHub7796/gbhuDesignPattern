package study.gbhu.designPattern.behavioralPattern.statePattern;

public interface State {
    void switchToGreen(TrafficLight trafficLight);
    void switchToYellow(TrafficLight trafficLight);
    void switchToRed(TrafficLight trafficLight);
}
