package abstract_factory_pattern.concrete_product;

import abstract_factory_pattern.abstract_product.VariableIncome;

public class PFVariableIncome implements VariableIncome {
    @Override
    public void buy() {
        System.out.println("Buying variable income to PF");
    }
}
