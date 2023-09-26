package study.gbhu.designPattern.behavioralPattern.commandPattern;

public class TV {
    public void on() {
        System.out.println("电视机开机");
    }
    public void off() {
        System.out.println("电视机关机");
    }
    public void channelUp() {
        System.out.println("电视机频道+");
    }

    public void channelDown() {
        System.out.println("电视机频道-");
    }
    public void volumeUp() {
        System.out.println("电视机音量+");
    }
    public void volumeDowm() {
        System.out.println("电视机音量-");
    }
}
