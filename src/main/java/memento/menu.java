package memento;
// 设计模式: 备忘录模式(memento)

public class menu {
    private static int vol = 0;
    private static int volSave = 0;
    // 保存此时的音量信息
    public static void Save() {
        System.out.println("Save data");
        volSave = vol;
    }
    public static void Volume(int delta) {
        vol += delta;
        System.out.println("the volume is " + vol);
    }
}
