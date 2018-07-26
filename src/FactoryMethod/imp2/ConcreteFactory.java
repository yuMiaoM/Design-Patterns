package FactoryMethod.imp2;

import FactoryMethod.imp1.Product;

/**
 * 通过反射实现产品类
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product p=null;
        try {
            p= (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
