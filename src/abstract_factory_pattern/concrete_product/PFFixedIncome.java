package abstract_factory_pattern.concrete_product;

import abstract_factory_pattern.abstract_product.FixedIncome;

public class PFFixedIncome implements FixedIncome {
    @Override
    public void buy() {
        System.out.println("Buying fixed income to PF");
    }
}
