package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo2;

import java.util.Random;

public class HRProject extends PM{
    private Random random = new Random();
    @Override
    public String analyze() {
        System.out.println("分析师，需求分析");
        return "人力资产管理系统需求";
    }

    @Override
    public String design(String project) {
        System.out.println("架构师：程序设计");
        return "设计("+project+")";
    }

    @Override
    public String develop(String project) {
        if (project.contains("bug")) {
            System.out.println("开发：修复bug");
            project = project.replace("bug", "");
            project = "修复(" + project + ")";
            if (random.nextBoolean()) {
                project += "bug";
            }
            return project;
        }
        System.out.println("开发：写代码");
        if (random.nextBoolean()) {
            project += "bug";
        }
        return "开发(" + project + ")";
    }

    @Override
    public boolean test(String project) {
        if (project.contains("bug")) {
            System.out.println("测试：发现bug");
            return false;
        }
        System.out.println("测试：用例通过");
        return true;
    }

    @Override
    public void release(String code) {
        System.out.println("上线发布");
        System.out.println(code);
    }
}
