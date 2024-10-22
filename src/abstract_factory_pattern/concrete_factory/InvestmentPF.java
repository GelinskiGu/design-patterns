package abstract_factory_pattern.concrete_factory;

import abstract_factory_pattern.abstract_factory.Investment;
import abstract_factory_pattern.abstract_product.FixedIncome;
import abstract_factory_pattern.abstract_product.VariableIncome;
import abstract_factory_pattern.concrete_product.PFFixedIncome;
import abstract_factory_pattern.concrete_product.PFVariableIncome;

public class InvestmentPF implements Investment {
    @Override
    public FixedIncome createFixedIncome() {
        return new PFFixedIncome();
    }

    @Override
    public VariableIncome createVariableIncome() {
        return new PFVariableIncome();
    }
}
