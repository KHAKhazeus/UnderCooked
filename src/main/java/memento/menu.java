package memento;
// 设计模式: 备忘录模式(memento)

public class Menu {
    private int vol = 0;
    private int volSave = 0;
    // 保存此时的音量信息
    public void Save() {
        System.out.println("memento:Save:("+this.toString()+"):Save data");
        volSave = vol;
    }
    public void Volume(int delta) {
        vol += delta;
        System.out.println("memento:Volume:("+this.toString()+"):the volume is " + vol);
    }
}
