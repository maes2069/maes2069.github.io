package n_fourteen.interfacepkg;

public class Bird implements Animal, SuperAnimal{
    @Override
    public void speak(){
        System.out.println("chirp");
    }
}
