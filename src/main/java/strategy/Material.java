package strategy;

public abstract class Material {
    CutMethod cutMethod;
    CookMethod cookMethod;
    Material(){}
    public void toCut(){
        cutMethod.cut();
    }
    public void toCook(){
        cookMethod.cook();
    }
}
