public class WoodFactory extends AbstractFactory{

    @Override
    public Chair CreateChair() {
        return new WoodChair();
    }

    @Override
    public Table CreateTable() {
        return new WoodTable();
    }
}
