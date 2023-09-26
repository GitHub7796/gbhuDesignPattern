package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class Move implements Expression{
    int x, y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void interpret() {
        System.out.println("移动鼠标"+x+","+y);
    }
}
