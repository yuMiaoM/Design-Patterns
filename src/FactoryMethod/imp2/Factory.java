package FactoryMethod.imp2;

import FactoryMethod.imp1.Product;

/**
 * 使用反射获得产品类
 */
public abstract class Factory {
    /**
     * @param clazz 需要实现的产品类
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
