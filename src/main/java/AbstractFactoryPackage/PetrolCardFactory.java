package AbstractFactoryPackage;

public class PetrolCardFactory implements AbstractFactory{
    @Override
    public Car getFactory(String car) {
        if(car == "Ford")
            return new Ford();
        else if(car == "Toyato")
            return new Toyato();
        else
            return null;
    }
}
