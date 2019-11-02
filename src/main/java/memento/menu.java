// 设计模式: 备忘录模式(memento)
// 保存此时的音量信息
public class menu {
    private static vol;
    public void Save() {
        System.out.println("Save data");
        Volume();
    }
    public void Volume(int delta) {
        if ( delta > 0 ) {
            this.vol += delta;
        } else {
        }
    }
}
