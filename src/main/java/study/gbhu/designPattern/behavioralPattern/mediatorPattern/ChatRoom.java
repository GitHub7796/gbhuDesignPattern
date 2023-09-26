package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    protected String name;//聊天室名字
    protected List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    protected void register(User user) {
        this.users.add(user);
        System.out.print("系统消息：欢迎【" + user.getName() + "】加入聊天室");
        System.out.println("系统当前人数" + users.size());
    }

    protected  void sendMsg(User from,String msg) {
        users.stream().forEach(toWhom->toWhom.listen(from,msg));
    }

}
