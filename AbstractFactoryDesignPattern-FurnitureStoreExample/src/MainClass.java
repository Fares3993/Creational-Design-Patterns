public class MainClass {
    public static void main(String []args)
    {
        FactoryProducer FP = new FactoryProducer();
        AbstractFactory WoodFactory = FP.getFactory("Wood");
        Chair Woodchair=WoodFactory.CreateChair();
        Woodchair.buildChair();
        Table WoodTable=WoodFactory.CreateTable();
        WoodTable.buildTable();

        AbstractFactory MetalFactory = FP.getFactory("Metal");
        Chair MetalChair=MetalFactory.CreateChair();
        MetalChair.buildChair();
        Table MetalTable= MetalFactory.CreateTable();
        MetalTable.buildTable();

    }
}
