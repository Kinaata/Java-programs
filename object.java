class class12{
    int stuID;
    String stuName;
    void writes(){
        System.out.println("jass writes an essay");
    }
}
public class object{
    public static void main(String[] args){
        class12 secA=new class12();
        secA.stuID=1;
        secA.stuName="jass";
        System.out.println(secA.stuID);
        System.out.println(secA.stuName);
        secA.writes();
    }
}