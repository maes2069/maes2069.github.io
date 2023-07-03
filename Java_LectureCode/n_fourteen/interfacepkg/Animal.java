package n_fourteen.interfacepkg;

public interface Animal {
    int NO_OF_LEGS = 4;
    //by default member variables are public, static final
    //by default methods are public, abstract
    void speak(); //common functionality so moved to interface
}
