package study.gbhu.designPattern.behavioralPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DrivingRecorder dr = new DrivingRecorder();
        //存储12条视频
        for (int i = 0; i < 12; i++) {
            dr.append("视频_"+i);
        }
        //存储位置
        List<String> uStorage = new ArrayList<>();
        //获取迭代器
        Iterator<String> it= dr.iterator();
        while (it.hasNext()) {
            String video = it.next();
            System.out.println(video);
            if ("视频_10".equals(video) || "视频_8".equals(video)) {
                uStorage.add(video);
            }
        }
        System.out.println("事故证据:"+uStorage);
    }
}
