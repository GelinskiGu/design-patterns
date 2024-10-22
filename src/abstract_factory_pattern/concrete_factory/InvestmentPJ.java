package abstract_factory_pattern.concrete_factory;

import abstract_factory_pattern.abstract_factory.Investment;
import abstract_factory_pattern.abstract_product.FixedIncome;
import abstract_factory_pattern.abstract_product.VariableIncome;

public class InvestmentPJ implements Investment {
    @Override
    public FixedIncome createFixedIncome() {
        return null;
    }

    @Override
    public VariableIncome createVariableIncome() {
        return null;
    }
}
