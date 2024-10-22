package factory_method_pattern.concrete_product;

import factory_method_pattern.product.VariableIncome;

public class Crypto implements VariableIncome {
    @Override
    public void buy() {
        System.out.println("Buying crypto");
    }
}
