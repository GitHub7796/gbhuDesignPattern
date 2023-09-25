package study.gbhu.designPattern.structuralPattern.flyweightPattern;

public class House implements Drawable{
    private String image;//河流图片

    public House() {
        this.image = "房屋";
        System.out.println("从磁盘加载:"+this.image);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在"+x+","+y+"绘制:"+this.image);
    }
}
