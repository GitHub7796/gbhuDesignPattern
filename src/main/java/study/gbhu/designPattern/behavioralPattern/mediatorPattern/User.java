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

    protected void logout() {
        chatRoom.register(this);
        this.chatRoom = null;
    }

    protected void talk(User to, String msg) {
        if (Objects.isNull(msg)) {
            System.out.println("【" + name + "】还未登录");
            return;
        }
        chatRoom.sendMsg(this, to, msg);
    }

    public void listen(User from, User to, String msg) {
        System.out.println("【" + this.getName() + "】的对话框");
        System.out.println(chatRoom.processMsg(from, to, name));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name,user.name);
    }
}
