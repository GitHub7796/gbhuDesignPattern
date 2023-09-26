package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class LeftKeyUP implements Expression{
    @Override
    public void interpret() {
        System.out.println("松下鼠标:左键");
    }
}
