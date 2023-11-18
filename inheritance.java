class Animal{
    String cellcount="multicellular";
    String cellulartype="eukaryotic";
    void moves(){
        System.out.println("elephant moves everywhere");
    }    
}
public class inheritance extends Animal{
    public static void main(String[] args) {
        String animalname="Elephant";
        inheritance ele=new inheritance();
        System.out.println("elephant is "+ele.cellcount);
        System.out.println("elephant is "+ele.cellulartype);
        ele.moves();
    }
}