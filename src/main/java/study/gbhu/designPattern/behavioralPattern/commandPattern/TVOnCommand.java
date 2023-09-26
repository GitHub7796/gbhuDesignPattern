package study.gbhu.designPattern.behavioralPattern.commandPattern;

//开机命令
public class TVOnCommand implements Command{
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.on();
    }

    @Override
    public void unexe() {
        tv.off();
    }
}
