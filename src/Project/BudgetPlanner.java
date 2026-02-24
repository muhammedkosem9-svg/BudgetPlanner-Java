package Project;

import java.util.Scanner;

public class BudgetPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double balance = 0.0;
        String history = ""; 
        boolean isRunning = true;

        System.out.println("=======================================");
        System.out.println("   WELCOME TO SMARTBUDGET ASSISTANT    ");
        System.out.println("=======================================");

        while (isRunning) {
            
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View History & Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble();
                    balance += income;
                    history += "Added Income: +$" + income + "\n";
                    System.out.println("SUCCESS: Income added to your account.");
                    break;

                case 2:
                   
                    System.out.println("\nSelect Category:");
                    System.out.println("1. Food");
                    System.out.println("2. Transport");
                    System.out.println("3. Entertainment");
                    System.out.print("Category choice: ");
                    int catChoice = scanner.nextInt();

                    String category;
 
                    switch (catChoice) {
                        case 1:
                            category = "Food";
                            break;
                        case 2:
                            category = "Transport";
                            break;
                        case 3:
                            category = "Entertainment";
                            break;
                        default:
                            category = "Other";
                            break;
                    }

                    System.out.print("Enter expense amount: ");
                    double expense = scanner.nextDouble();

                    
                    if (expense > balance) {
                        System.out.println("ERROR: Insufficient balance! Transaction cancelled.");
                    } else {
                        balance -= expense;
                        history += "Expense (" + category + "): -$" + expense + "\n";
                        System.out.println("SUCCESS: Expense recorded under " + category + ".");
                    }
                    break;

                case 3:
                    
                    System.out.println("\n===== FINANCIAL SUMMARY =====");
                    if (history.isEmpty()) {
                        System.out.println("No transactions recorded yet.");
                    } else {
                        System.out.println("Transaction History:");
                        System.out.println(history);
                    }
                    System.out.println("-----------------------------");
                    System.out.println("CURRENT BALANCE: $" + balance);
                    System.out.println("=============================");
                    break;

                case 4:
                    
                    isRunning = false;
                    System.out.println("Thank you for using SmartBudget. Goodbye!");
                    break;

                default:
                    
                    System.out.println("INVALID OPTION: Please enter a number between 1 and 4.");
                    break;
            }
        }
        
        scanner.close(); 
    }

    }
	
	

	
