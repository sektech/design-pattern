package AbstractFactoryPackage;

public class FactoryProcess {

    public static AbstractFactory getFactory(String factory){
        if(factory == "Electric")
            return new ElectricCarFactory();
        else if(factory == "Petrol")
            return  new PetrolCardFactory();
        else
            return null;
    }
}
