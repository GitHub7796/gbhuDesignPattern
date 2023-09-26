package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

import java.util.Objects;

public class User {
    private String name;
    protected ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void login(ChatRoom chatRoom) {
        chatRoom.register(this);
        this.chatRoom = chatRoom;
    }

    protected void talk(String msg) {
        chatRoom.sendMsg(this, msg);
    }

    public void listen(User from, String msg) {
        System.out.print("【" + this.getName() + "】的对话框");
        System.out.println(from.getName()+"说:"+msg);
    }

}
