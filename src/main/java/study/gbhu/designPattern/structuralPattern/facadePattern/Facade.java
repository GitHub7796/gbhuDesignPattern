package study.gbhu.designPattern.structuralPattern.facadePattern;

import study.gbhu.designPattern.structuralPattern.facadePattern.entity.Chef;
import study.gbhu.designPattern.structuralPattern.facadePattern.entity.Cleaner;
import study.gbhu.designPattern.structuralPattern.facadePattern.entity.VegVendor;
import study.gbhu.designPattern.structuralPattern.facadePattern.entity.Waiter;

public class Facade {
    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade() {
        this.vegVendor = new VegVendor();
        vegVendor.purchase();//买菜
        this.chef = new Chef();//雇佣厨师
        this.waiter = new Waiter();//雇佣服务员
        this.cleaner = new Cleaner();//雇佣清洁工
    }

    public void order() {
        waiter.order();//接待顾客
        chef.cook();//厨师炒菜
        waiter.serve();//上菜
        cleaner.clean();//收拾桌子
        cleaner.wash();//清洗盘子
    }
}
