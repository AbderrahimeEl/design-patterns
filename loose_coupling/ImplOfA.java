package loose_coupling;

public class ImplOfA implements InterfaceA{
    public InterfaceB interfaceB;

    public ImplOfA(InterfaceB interfaceB){
        this.interfaceB = interfaceB;
        System.out.println("i am the constructor of ImplOfA");
    }

    @Override
    public void methodA() {
        System.out.println("\n hello from impl 1 " + interfaceB.toString());
        interfaceB.methodB();
    }
}
