package study.gbhu.designPattern.structuralPattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    private Map<String, Drawable> images;

    public TileFactory() {
        this.images = new HashMap<>();
    }

    public Drawable getDrawable(String image) {
        if (!images.containsKey(image)) {
            switch (image) {
                case "河流":
                    images.put(image, new River());
                    break;
                case "草地":
                    images.put(image, new Grass());
                    break;
                case "道路":
                    images.put(image, new Road());
                    break;
                case "房屋":
                    images.put(image, new House());
                    break;
            }
        }
        return images.get(image);
    }
}
