import java.util.Scanner;

public class CoffeeOrderingSystem {
    double Total_bill;
    int choose;
    Scanner scan = new Scanner(System.in);
    void ordering() {
        do {
            System.out.println("*********************************");
            System.out.println("\u263A Welcome to the coffee cafe! \u2615");
            System.out.println("*********************************");
            System.out.println("Choose your coffee:\n1. Espresso - \u20B9200" +
                    "\n2. Cappuccino - \u20B9250\n3. Latte - \u20B9300");
            System.out.print("Enter your choose:");
            choose = scan.nextInt();
            Total_bill = switch (choose) {
                case 1 -> {
                    Total_bill = 200;
                    System.out.println("thanks for selecting : Espresso");
                    yield Total_bill;
                }
                case 2 -> {
                    Total_bill = 250;
                    System.out.println("thanks for selecting : Cappuccino");
                    yield Total_bill;
                }
                case 3 -> {
                    Total_bill = 300;
                    System.out.println("thanks for selecting : latte");
                    yield Total_bill;
                }

                default -> {
                    Total_bill = -1;
                    System.out.println("enter valid choose.");
                    yield Total_bill;
                }
            };
            System.out.println("");
        }while (choose<0||choose>3);
        if (Total_bill > 0) {
            System.out.print("Add whipped cream for \u20B930? (yes=1 / no=0) :");
            int cream = scan.nextInt();
            if (cream == 1) {
                Total_bill += 30;
            }
            System.out.print("Add flavor shot? (Vanilla for \u20B920 or Hazelnut for" +
                    " \u20B925 (yes=1 / no=0) :");
            int flavor = scan.nextInt();

            if (flavor == 1) {
                int selected;
                do {
                    System.out.print("which one? (enter 1 for vanilla(\u20B920) or" +
                            " 2 for hazelnut(\u20B925)):");
                    selected = scan.nextInt();
                    Total_bill = switch (selected) {
                        case 1 -> {
                            Total_bill += 20;
                            yield Total_bill;
                        }
                        case 2 -> {
                            Total_bill += 25;
                            yield Total_bill;
                        }
                        default -> {
                            System.out.println("Invalid flavor selection!");
                            yield Total_bill;
                        }
                    };
                    System.out.println("");
                }while(selected<0||selected>2);
                System.out.println("Total bill: \u20B9" + Total_bill);
            }
            else {
                System.out.println("Total bill: \u20B9" + Total_bill);
            }

        }
    }
    public static void main(String[] args) {
        CoffeeOrderingSystem obj = new CoffeeOrderingSystem();
        obj.ordering();
    }
}
