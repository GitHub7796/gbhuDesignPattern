package study.gbhu.designPattern.behavioralPattern.iteratorPattern;

public class DrivingRecorder implements Iterable{
    private int index = -1;//当前记录位置
    private String[] records = new String[10];//假设只能记录10条视频

    public void append(String record) {
        //如果存储满了，那么从头开始，覆盖掉之前的数据
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = record;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {

        int cursor = index;//迭代器游标
        int loopCount = 0;

        @Override
        public String next() {
            int i = cursor;
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }
        @Override
        public boolean hasNext() {
            return loopCount<10;
        }
    }
}
