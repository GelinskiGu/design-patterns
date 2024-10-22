package abstract_factory_pattern;

import abstract_factory_pattern.client.BankAccount;
import abstract_factory_pattern.concrete_factory.InvestmentPF;
import abstract_factory_pattern.concrete_factory.InvestmentPJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Abstract Factory Pattern");

        BankAccount bankAccount = getBankAccount();

        if (bankAccount == null) {
            System.out.println("Invalid document");
            return;
        }

        bankAccount.buy();
    }

    private static BankAccount getBankAccount() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String document = reader.readLine();

        String typePerson = getTypePerson(document);
        if (typePerson.equals("PF")) {
            return new BankAccount(new InvestmentPF());
        }

        if (typePerson.equals("PJ")) {
            return new BankAccount(new InvestmentPJ());
        }

        return null;
    }

    private static String getTypePerson(String document) {
        if (document.length() == 14) {
            return "PJ";
        }

        if (document.length() == 11) {
            return "PF";
        }

        return "Invalid document";
    }
}
