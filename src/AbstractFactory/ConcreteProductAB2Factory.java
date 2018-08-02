package AbstractFactory;

public class ConcreteProductAB2Factory extends AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public  AbstractProductB getProductB() {
        return new ProductB2();
    }
}
