package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo1;

public class Client {
    public static void main(String[] args) {
        Mammal mammal = new Whale();
        mammal.live();

        mammal = new Human();
        mammal.live();
    }
}
