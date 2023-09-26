package study.gbhu.designPattern.behavioralPattern.interpreterPattern;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Expression sequence = new Sequence(
                Arrays.asList(
                        new Move(500, 500),
                        new Repition(
                                5,
                                new Sequence(
                                        Arrays.asList(new LeftKeyClick(), new Delay(1))
                                )

                        ),
                        new Delay(10)
                )
        );
        sequence.interpret();
    }
}
