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
