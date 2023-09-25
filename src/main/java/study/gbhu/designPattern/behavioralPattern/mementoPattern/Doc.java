package study.gbhu.designPattern.behavioralPattern.mementoPattern;

public class Doc {
    private String title;
    private String body;

    public Doc(String title) {
        this.title = title;
        this.body = "";//需初始化，不然输出null
    }
    public History createHistory() {
        return new History(body);
    }

    public void resotreHistory(History history) {
        this.body = history.getBody();//恢复历史数据
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
