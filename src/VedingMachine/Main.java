package VedingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VedingMachine vedingMachine = new TextBasedVendingMachine();

        vedingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vedingMachine.selectProduct(selectProductNumber);

        vedingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();

        int[] enteresCoins = Coin.parseCoins(userEnteredCoins);

        vedingMachine.enterCoins(enteresCoins);
        vedingMachine.displayChangeMessage();
    }
}
