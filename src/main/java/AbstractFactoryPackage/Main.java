package AbstractFactoryPackage;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factories = FactoryProcess.getFactory("Electric");
        factories.getFactory("Tesla").display();


    }
}
