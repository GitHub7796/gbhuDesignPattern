package study.gbhu.designPattern.behavioralPattern.commandPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keyboard {
    public enum KeyCode {F1, F2, ESC, UP, DOWN, LEFT, RIGHT;}

    private Map<KeyCode, List<Command>> keyCommands = new HashMap<>();

    public void bindKeyCommand(KeyCode keyCode, List<Command> commands) {
        this.keyCommands.put(keyCode, commands);
    }

    public void onKeyPressed(KeyCode keyCode) {
        System.out.print(keyCode + "键按下");
        List<Command> commands = this.keyCommands.get(keyCode);
        if (commands == null) {
            System.out.println("无效命令");
            return;
        }
        commands.stream().forEach(command -> command.exe());

    }
}
