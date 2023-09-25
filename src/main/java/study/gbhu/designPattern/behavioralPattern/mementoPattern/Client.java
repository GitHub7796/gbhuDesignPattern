package study.gbhu.designPattern.behavioralPattern.mementoPattern;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("AI的觉醒"));
        editor.append("第一章 混沌初开");
        editor.append("\n 正文 2k字");
        editor.append("第二章 荒漠之花 \n 正文3k字");
        editor.delete();
        editor.undo();

    }
}
