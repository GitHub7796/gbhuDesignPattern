package study.gbhu.designPattern.behavioralPattern.commandPattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        TV tv = new TV();
        Command tvOncommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);
        Command tvChannelUpCommand = new TVChannelUpCommand(tv);

        keyboard.bindKeyCommand(
                Keyboard.KeyCode.F2,
                Arrays.asList(tvOncommand)
        );
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.LEFT,
                Arrays.asList(tvChannelUpCommand)
        );
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.ESC,
                Arrays.asList(tvOffCommand)
        );

        keyboard.onKeyPressed(Keyboard.KeyCode.F1);
        keyboard.onKeyPressed(Keyboard.KeyCode.LEFT);
        keyboard.onKeyPressed(Keyboard.KeyCode.UP);
        keyboard.onKeyPressed(Keyboard.KeyCode.ESC);
    }
}
