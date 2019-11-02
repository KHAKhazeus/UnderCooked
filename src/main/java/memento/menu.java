package memento;
// 设计模式: 备忘录模式(memento)

public class menu {
    private static vol;
    // 保存此时的音量信息
    public void Save() {
        System.out.println("Save data");
        Volume(0);
    }
    public void Volume(int delta) {
        this.vol += delta;
        System.out.println("the volume is " + vol);
    }
}
