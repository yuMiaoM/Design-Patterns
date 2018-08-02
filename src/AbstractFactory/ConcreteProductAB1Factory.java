package AbstractFactory;

public class ConcreteProductAB1Factory extends AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB1();
    }
}
