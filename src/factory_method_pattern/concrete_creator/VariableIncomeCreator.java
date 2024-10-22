package factory_method_pattern.concrete_creator;

import factory_method_pattern.concrete_product.Crypto;
import factory_method_pattern.concrete_product.FII;
import factory_method_pattern.concrete_product.Stock;
import factory_method_pattern.creator.Investment;
import factory_method_pattern.product.VariableIncome;

public class VariableIncomeCreator extends Investment {
    @Override
    public VariableIncome chooseAssetType(String type) {
        return switch (type) {
            case "Stock" -> new Stock();
            case "Crypto" -> new Crypto();
            case "FII" -> new FII();
            default -> null;
        };
    }
}
