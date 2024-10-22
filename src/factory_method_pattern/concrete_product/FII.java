package factory_method_pattern.concrete_product;

import factory_method_pattern.product.VariableIncome;

public class FII implements VariableIncome {
    @Override
    public void buy() {
        System.out.println("Buying FII");
    }
}
