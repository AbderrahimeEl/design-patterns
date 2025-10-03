package loose_coupling;

public class ImplOfB implements InterfaceB {
    public  ImplOfB(){
        System.out.println("i am the implementation of B\n");
    }
    @Override
    public void methodB() {
        System.out.println("i am from the impl 1");
    }   
}
