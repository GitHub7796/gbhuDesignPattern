package study.gbhu.designPattern.behavioralPattern.visitorPattern;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Acceptable> products = Arrays.asList(
                new Candy("小白兔糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("老猫白酒", LocalDate.of(2018, 10, 1), 20.00f),
                new Fruit("草莓", LocalDate.of(2018, 10, 1), 20.00f,2.5f)
        );
        Visitor discounterVisitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
        for (Acceptable product : products) {
            product.accpet(discounterVisitor);
        }
    }
}
