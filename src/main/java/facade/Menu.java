package facade;

public class Menu {
    private Pause pause;
    private Resume resume;
    private Bgm bgm;

    public Menu() {
        pause = new Pause();
        resume = new Resume();
        bgm = new Bgm();
    }

    //点击暂停游戏
    public void clickPause() {
        pause.setPause();
    }

    //点击继续游戏
    public void clickResume() {
        resume.setResume();
    }

    //点击打开背景音乐
    public void clickBgmOn() {
        bgm.turnBgmOn();
    }

    //点击关闭背景音乐
    public void clickBgmDown() {
        bgm.turnBgmDown();
    }
}
