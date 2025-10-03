package loose_coupling;

public class Main {
    public static void main(String args[]){
        ImplOfB ImplOfB = new ImplOfB();
        ImplOfB2 implOfB2 = new ImplOfB2();
        InterfaceA interfaceA = new ImplOfA(implOfB2);
        interfaceA.methodA();
    }
}
