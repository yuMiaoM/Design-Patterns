package FactoryMethod.imp1;

/**
 * 工厂实现类返回相应的产品
 */
public class ConcreteFactory extends Factory {
    /**
     * 返回Product 实现类 ProductA 或者Product B
     * @return
     */
    @Override
    public Product createProdct() {

        return  new ProductA();
        //return  new ProductB();
    }
}
