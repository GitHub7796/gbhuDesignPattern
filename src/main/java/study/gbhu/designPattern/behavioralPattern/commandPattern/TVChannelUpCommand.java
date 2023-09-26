package study.gbhu.designPattern.behavioralPattern.commandPattern;

public class TVChannelUpCommand implements Command{
    private TV tv;

    public TVChannelUpCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void exe() {
        tv.channelUp();
    }

    @Override
    public void unexe() {
        tv.channelDown();
    }
}
