package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo2;

public abstract class PM {
    public abstract String analyze();//需求分析
    public abstract String design(String project);//软件设计
    public abstract String develop(String project);//代码开发
    public abstract boolean test(String project);//质量测试
    public abstract void release(String project);//上线发布
    protected final void kickoff(){
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        } while (!test(designCode));//测试失败就修改代码
        release(designCode);
    }

}
