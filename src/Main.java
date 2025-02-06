//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Questão 1
        Car fiatToro = new Car();

        fiatToro.model = "Fiat Toro";
        fiatToro.year = 2025;
        fiatToro.color = "Prata";

        fiatToro.alterSpeed(35);
        fiatToro.informationCar();
        fiatToro.accelerateCar();
        fiatToro.brakeCar();

        //Questão 2
        Book harryPotter = new Book();

        harryPotter.title = "Harry Potter e o cálice de fogo";
        harryPotter.author = "J. K. Rowling";
        harryPotter.yearPublication = 2003;

        harryPotter.returnBook();
        harryPotter.informationBook();
        harryPotter.lend();
        harryPotter.returnBook();
        harryPotter.lend();

        //Questão 3
        BankAccount harry = new BankAccount();
        BankAccount hermione = new BankAccount();

        harry.sale = 1000.00;
        harry.numberAccount = 0001;
        harry.nameHolder = "Harry Potter";

        hermione.sale = 500.50;
        hermione.numberAccount = 0002;
        hermione.nameHolder = "Hermione Granger";

        harry.viewSale();
        harry.withdraw(1000.01);
        harry.deposits(355.50);
        harry.viewSale();
        harry.withdraw(1000.01);
        harry.transfer(65.50, hermione.numberAccount, hermione.nameHolder);


    }
}