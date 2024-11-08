package Nov.MultiLevelInheritance;

public class Lab156_MultiLevelIhn {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.gf();
        c.f();
        c.c();

        Father f = new Father();
        f.home();
        f.extra();
        f.gf();

        GrandFather g = new GrandFather();
        g.gf();
        g.home();
    }
}
