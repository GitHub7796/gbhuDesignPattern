package study.gbhu.designPattern.behavioralPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private Doc doc;
    private List<History> historyList;
    private int historyListPos = -1;

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc;
        historyList = new ArrayList<>();//初始化历史记录列表
        backup();//保存快照
        show();//显示内容
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody() + txt);
        backup();
        show();
    }

    public void save() {
        System.out.println("<<<保存");
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        backup();
        show();
    }
    private void backup() {
        historyList.add(doc.createHistory());
        historyListPos++;
    }

    private void show() {
        System.out.println(doc.getBody());
        System.out.println("文档结束>>>");
    }

    public void undo() {
        System.out.println(">>>撤销操作");
        if (historyListPos == 0) {
            return;
        }
        historyListPos--;
        History history = historyList.get(historyListPos);
        doc.resotreHistory(history);
        show();
    }
}
