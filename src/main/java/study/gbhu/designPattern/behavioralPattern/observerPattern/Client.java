package study.gbhu.designPattern.behavioralPattern.observerPattern;

public class Client {
    public static void main(String[] args) {
        Buyer tangSir = new PhoneFans("手机粉");
        Buyer brjee = new HandChopper("剁手党");
        Shop shop = new Shop();
        shop.register(tangSir);
        shop.register(brjee);
        shop.setProduct("猪肉");
        shop.setProduct("句子手机");

    }
}
