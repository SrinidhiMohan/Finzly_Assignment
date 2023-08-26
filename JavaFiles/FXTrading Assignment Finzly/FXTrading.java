package javaByKiran;
/*Write a java program for converting USD to INR. This is small stripped down use case of Foreign exchange trading. This program should be designed to assist users with transferring USD to INR. The design should be flexible such that new currency can be added with minimal change and impact to existing functionality.
 * Program should display following options to user and should work as explained below:

 

l Book Trade - 1

l Print Trades - 2

l Exit - 3

 

Book Trade -1 

Enter customer Name

 John M.

Enter Currency Pair

	USDINR

Enter amount to transfer

	1000

Do you want to get Rate

	Yes

You are transferring INR 66,0000 to John M.( Assuming that rate was 66.00)

Book/Cancel this trade?

Book - Trade should be booked and confirmation to be displayed as below

	Trade for USDINR has been booked with rate 66.00 , The amount of Rs 66,0000 will  be transferred in 2 working days to John M..

Cancel : Print message as below

	Trade is Canceled. 

Display list of operation supported by the program ( Book Trade, Print Trades , Exit)

 

Program should allow users to book only USDINR, on entering invalid input ,appropriate error message must be displayed.

 

The rate for USDINR can be hardcoded in program but should be easy to change.

 

The Total amount displayed should be shown in expected format only.

 

Print Trades -2 

When user enters 2 , print the list of trades booked. The information must be printed as shown below

 

TradeNo CurrencyPair CustomerName Amount   Rate 

1          USDINR John M.      INR66,000 66.00

 

Exit -3

 

Prompt user for confirmation

Do you really want to exit (y/n)

Y

Bye - have a good day

N

Show standard operations supported by the program.
 * 
 * */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Trade {
    private String currencyPair;
    private String customerName;
    private double amount;
    private double rate;
    private static double tradingAmountLimit = 1.7976931348623157E+308;
    public Trade(String currencyPair, String customerName, double amount, double rate) {
    	if(currencyPair.equalsIgnoreCase("usdinr")) {
			this.currencyPair = currencyPair;
		} else if (currencyPair.toLowerCase() == null) {
			System.out.println("Currency pair cannot be null. Please enter valid currency pair.");
			System.exit(0);
		}
		else {
			System.out.println("Please enter valid currency pair. Currrency pair can be USDINR");
			System.exit(0);
		}
        if(customerName == null) {
			System.out.println("Customer name connot be null. Please enter valid customer name");
			System.exit(0);
			
			
		}else if(customerName.isEmpty()) {
			System.out.println("Customer name cannot be empty. Please enter valid customer name");
			System.exit(0);
		}
		else {
			this.customerName=customerName;
		}
        if(amount <0) {
			System.out.println("Amount can be negative. Please enter a valid amount");
			System.exit(0);
		}else if(amount >= tradingAmountLimit) {
			System.out.println("Sorry !You have entered an amount greater than maximum trading limit. Please enter a valid amount");
			System.exit(0);
		}else if(amount==0) {
			System.out.println("Amount can't be zero. Kindly enter a valid amount");
			System.exit(0);
		}else {
			this.amount = amount;
		}	
        this.rate = rate;
    }
    public String getCurrencyPair() {
        return currencyPair;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }
}

class Operations {
    private static double rate = 66.00;
    private List<Trade> trades = new ArrayList<>();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	System.out.println("| Book Trade - 1 \n| Print Trades - 2 \n| Exit - 3 ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTrade(scanner);
                    break;
                case 2:
                    printTrades();
                    break;
                case 3:
                    System.out.print("Do you really want to exit (y/n): ");
                    char confirmExit = scanner.next().charAt(0);
                    if (confirmExit == 'y' || confirmExit == 'Y') {
                        System.out.println("Bye - have a good day");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (true);
    }

    private void bookTrade(Scanner scanner) {
        
        scanner.nextLine(); 
        
        System.out.print("Enter customer Name: ");
        String customerName = scanner.nextLine();
        try {
			if(customerName.isEmpty()) {
				System.out.println("Name can not be empty. Kindly enter a valid name");
				System.exit(0);
			}}catch(NullPointerException e) {
				System.out.println("Name can not be null. Kindly enter a valid name");
				System.exit(0);
			}
        
        System.out.print("Enter Currency Pair: ");
        String currencyPair = scanner.nextLine();
       
        try {
			if(currencyPair.isEmpty()) {
				System.out.println("Currency pair can not be empty. Kindly enter a valid name");
				System.exit(0);
			}}catch(NullPointerException e) {
				System.exit(0);
			}

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline left by previous input
        System.out.print("Do you want to get Rate (yes/no): ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            double calculatedAmount = rate * amount;
            System.out.println("You are transferring INR " + formatAmount(calculatedAmount) +
                               " to " + customerName + " (Assuming that rate was " + rate + ")");
        }

        System.out.print("Book/Cancel this trade? ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("book")) {
            trades.add(new Trade(currencyPair, customerName, amount, rate));
            System.out.println("Trade for " + currencyPair + " has been booked with rate " + rate +
                               ", The amount of Rs " + formatAmount(amount * rate) +
                               " will be transferred in 2 working days to " + customerName + "..");
        } else if (response.equalsIgnoreCase("cancel")) {
            System.out.println("Trade is Canceled.");
        } else {
            System.out.println("Please enter a valid response.");
        }
    }

    private void printTrades() {
        System.out.println("Print Trades - 2");
        System.out.println("TradeNo CurrencyPair CustomerName  Amount     Rate");
        int tradeNumber = 1;
        for (Trade trade : trades) {
            System.out.printf("%-7d %-12s %-13s %-10s %.2f%n", tradeNumber,
                    trade.getCurrencyPair(), trade.getCustomerName(),
                    formatAmount(trade.getAmount()), trade.getRate());
            tradeNumber++;
        }
    }

    private String formatAmount(double amount) {
        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,##,##,##,##,##,##,##,##,##,###.00");
        return "INR" + df.format(amount);
    }
}

public class FXTrading {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.start();
    }
}
