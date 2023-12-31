package study.gbhu.designPattern.behavioralPattern.commandPattern;

public class TVOffCommand implements Command{
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void exe() {
        tv.off();
    }

    @Override
    public void unexe() {
        tv.on();
    }
}
