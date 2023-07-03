package n_fourteen.interfacepkg;

public class AnimalMain {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.speak();
        Tiger tiger = new Tiger();
        tiger.speak();
        Animal a1 = new Bird();
        a1.speak();
        Animal a2 = new Tiger();
        a2.speak();
    }
}
