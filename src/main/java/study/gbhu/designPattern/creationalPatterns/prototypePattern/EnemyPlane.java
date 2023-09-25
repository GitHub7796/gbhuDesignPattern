package study.gbhu.designPattern.creationalPatterns.prototypePattern;

public class EnemyPlane implements Cloneable {

    private int x;//x坐标
    private int y;//y坐标

    public EnemyPlane(int x) {
        this.x = x;
    }

    /**
     * 放开setX 是为了让克隆后的实例可以重新设置坐标
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    //敌人飞
    public void fly() {
        y++;
    }

    //重写克隆方法
    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        return (EnemyPlane) super.clone();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
