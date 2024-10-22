package factory_method_pattern;

import factory_method_pattern.concrete_creator.VariableIncomeCreator;
import factory_method_pattern.creator.Investment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Factory Method Pattern");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String type = reader.readLine();

        Investment investment = new VariableIncomeCreator();
        investment.buyAsset(type);
    }
}
