package study.gbhu.designPattern.behavioralPattern.mediatorPattern;

public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom("设计模式");
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");
        user1.login(chatRoom);
        user2.login(chatRoom);
        user3.login(chatRoom);
        user1.talk("user2、3你好");
        user2.talk("user1 好");
    }
}
