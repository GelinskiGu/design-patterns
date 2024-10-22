package abstract_factory_pattern.abstract_factory;

import abstract_factory_pattern.abstract_product.FixedIncome;
import abstract_factory_pattern.abstract_product.VariableIncome;

public interface Investment {
    FixedIncome createFixedIncome();
    VariableIncome createVariableIncome();
}
