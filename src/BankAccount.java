public class BankAccount {
    public int numberAccount;
    public String nameHolder;
    public double sale;

    public void deposits(double valueDeposits) {
        this.sale += valueDeposits;

        System.out.println("depositado "+valueDeposits+" na conta "+this.numberAccount);
    }

    public void withdraw(double valueWithdraw) {
        if (valueWithdraw > this.sale) {
            System.out.println("Saldo insuficiente para o saque!");
        } else {
            this.sale -= valueWithdraw;

            System.out.println("Saque de "+valueWithdraw+ " Feito.\nSeu saldo atual: "+this.sale);
        }
    }

    public void transfer(double valueTransfer, BankAccount accountNumber, String holderName) {
        if (valueTransfer > this.sale) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            this.sale -= valueTransfer;

            System.out.println("Tranferência de "+valueTransfer+" feita para a conta "+accountNumber.getNumberAccount()+" de "+holderName+"\nSeu saldo atual: "+this.sale);

        }
    }

    public void viewSale() {

        System.out.println("Seu saldo: "+this.sale);
    }

    public int getNumberAccount() {
        return numberAccount;
    }
}
