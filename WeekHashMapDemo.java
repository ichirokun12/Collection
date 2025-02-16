import java.util.WeakHashMap;

public class WeekHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put(new String("img1"), new Image("image1"));
        imageCache.put(new String("img2"), new Image("image2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared) " + imageCache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("simulating running....");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}

 class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
