public class FactoryProducer {
    public AbstractFactory getFactory(String FactoryType)
    {
        if(FactoryType.equalsIgnoreCase("Wood"))
            return new WoodFactory();
        else if(FactoryType.equalsIgnoreCase("Metal"))
            return new MetalFactory();
        return null;
    }
}
