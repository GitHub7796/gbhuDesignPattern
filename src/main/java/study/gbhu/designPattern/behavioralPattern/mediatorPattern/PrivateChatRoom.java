package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

public class PrivateChatRoom extends ChatRoom{
    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    protected void register(User user) {
        if (users.size() == 2) {
            //聊天室最多2人
            System.out.println("聊天室已满");
            return;
        }
        super.register(user);
        System.out.print("系统消息：欢迎【"+user.getName()+"】加入2人聊天室");
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        users.forEach(user -> user.listen(from, null, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        return from.getName()+"说:"+msg;
    }
}
