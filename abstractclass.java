abstract class yuvathi{
    public abstract void plays();
    public void eats(){
        System.out.println("yuvathi eats a carrot");
    }
}
class football extends yuvathi{
    public void plays(){
        System.out.println("yuvathi plays football");
    }
}
class tennis extends yuvathi{
    public void plays(){
        System.out.println("yuvathi plays tennis");
    }
}
public class abstractclass{
    public static void main(String[] args) {
        yuvathi yuvaf=new football();
        yuvaf.eats();
        yuvaf.plays();
        yuvathi yuvat=new tennis();
        yuvat.plays();
    }
}