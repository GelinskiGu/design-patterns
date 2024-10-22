package factory_method_pattern.creator;


import factory_method_pattern.product.VariableIncome;

public abstract class Investment {
    public void buyAsset(String type) {
        VariableIncome variableIncome = chooseAssetType(type);
        variableIncome.buy();
    }

    public abstract VariableIncome chooseAssetType(String type);
}
