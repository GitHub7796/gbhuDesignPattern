package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo1;

public class Whale extends Mammal{
    @Override
    public void move() {
        System.out.println("鲸鱼在水里游");
    }

    @Override
    public void eat() {
        System.out.println("鲸鱼捕鱼吃");
    }
}
