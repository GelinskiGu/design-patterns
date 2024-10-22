package abstract_factory_pattern.client;

import abstract_factory_pattern.abstract_factory.Investment;
import abstract_factory_pattern.abstract_product.FixedIncome;
import abstract_factory_pattern.abstract_product.VariableIncome;

public class BankAccount {
    private final FixedIncome fixedIncome;
    private final VariableIncome variableIncome;

    public BankAccount(Investment factory) {
        fixedIncome = factory.createFixedIncome();
        variableIncome = factory.createVariableIncome();
    }

    public void buy() {
        fixedIncome.buy();
        variableIncome.buy();
    }
}
