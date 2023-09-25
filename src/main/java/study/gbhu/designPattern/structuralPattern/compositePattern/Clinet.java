package study.gbhu.designPattern.structuralPattern.compositePattern;

public class Clinet {
    public static void main(String[] args) {
        Node driveD = new Floder("D:");
        Node doc = new Floder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.doc"));
        driveD.add(doc);
        Node music = new Floder("音乐");
        Node jay = new Floder("周杰伦");
        jay.add(new File("双截棍.mp4"));
        jay.add(new File("告白气球.mp4"));
        jay.add(new File("听妈妈的话.mp4"));

        Node jack= new Floder("张学友");
        jack.add(new File("吻别.mp4"));
        jack.add(new File("一千个伤心的理由.mp4"));

        music.add(jay);
        music.add(jack);
        driveD.add(music);

        driveD.tree();
    }
}
