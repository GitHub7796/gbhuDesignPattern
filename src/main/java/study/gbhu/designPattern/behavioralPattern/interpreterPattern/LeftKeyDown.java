package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class LeftKeyDown implements Expression{
    @Override
    public void interpret() {
        System.out.println("按下鼠标:左键");
    }
}
