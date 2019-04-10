public class BankAccount {
    private String account;
    private int balance;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String [] args) {
        CheckingAccount aikiCheckingAccount = new CheckingAccount();
        SavingsAccount aikiSavingsAccount = new SavingsAccount();
        CertificateOfDeposit aikiCertificateOfDeposit = new CertificateOfDeposit();

        BankAccount aikiBankAccount = new BankAccount();
        aikiBankAccount.setAccount("088134");
        System.out.println(aikiBankAccount.getAccount());

        aikiBankAccount.setBalance(1400);
        System.out.println(aikiBankAccount.getBalance());


    }
}
