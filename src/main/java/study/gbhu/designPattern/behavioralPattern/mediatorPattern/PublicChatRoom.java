package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

import java.util.Objects;

public class PublicChatRoom extends ChatRoom{
    public PublicChatRoom(String name) {
        super(name);
    }

    @Override
    protected void register(User user) {
        super.register(user);
        System.out.print("系统消息：欢迎【"+user.getName()+"】加入聊天室");
        System.out.println("系统当前人数"+users.size());
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.print("系统消息：【"+user.getName()+"】离开聊天室");
        System.out.println("系统当前人数"+users.size());
    }

    @Override
    protected void sendMsg(User from, User to, String msg) {
        if (Objects.isNull(to)) {//接收为空，将消息发送给所有人
            users.forEach(user -> user.listen(from, null, msg));
            return;
        }
        users.stream().filter(
                user -> user.equals(to) || user.equals(from)
        ).forEach(
                user -> user.listen(from, to, msg)
        );

    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        String toName = "所有人";
        if (!Objects.isNull(to)) {
            toName = to.getName();
        }
        return from.getName()+"对"+to.getName()+"说:"+msg;
    }
}
