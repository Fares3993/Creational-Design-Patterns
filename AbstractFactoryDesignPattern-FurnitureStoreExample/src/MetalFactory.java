public class MetalFactory extends AbstractFactory{

    @Override
    public Chair CreateChair() {
        return new MetalChair();
    }

    @Override
    public Table CreateTable() {
        return new MetalTable();
    }
}
