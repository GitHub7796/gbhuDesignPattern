package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatRoom {
    protected String name;//聊天室名字
    protected List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    protected void register(User user) {
        this.users.add(user);
    }

    protected void deregister(User user) {
        this.users.remove(user);
    }

    protected abstract void sendMsg(User from, User to, String msg);
    protected abstract String processMsg(User from, User to, String msg);
}
