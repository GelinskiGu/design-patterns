package abstract_factory_pattern.concrete_factory;

import abstract_factory_pattern.abstract_factory.Investment;
import abstract_factory_pattern.abstract_product.FixedIncome;
import abstract_factory_pattern.abstract_product.VariableIncome;
import abstract_factory_pattern.concrete_product.PJFixedIncome;
import abstract_factory_pattern.concrete_product.PJVariableIncome;

public class InvestmentPJ implements Investment {
    @Override
    public FixedIncome createFixedIncome() {
        return new PJFixedIncome();
    }

    @Override
    public VariableIncome createVariableIncome() {
        return new PJVariableIncome();
    }
}
