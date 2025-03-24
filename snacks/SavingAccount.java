import Abstraction.BankAccount;

public class SavingAccount extends BankAccount {

    @Override
    public String withdraw() {
        return "Saving Account";
    }

    @Override
    public String deposit() {
        return "deposit";
    }
}
