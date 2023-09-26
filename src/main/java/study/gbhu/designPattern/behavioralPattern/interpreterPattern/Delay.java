package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

public class Delay implements Expression{
    private int seconds;

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void interpret() {
        System.out.println("延迟" + seconds + "s");
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
