package Assignment;
import java.util.Scanner;

class TestPolymorphism {
    public static void itemInstance(StockItem s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Printing item stock information:");
        System.out.println(s);

        System.out.print("Enter the number of stock units to increase: ");
        int increase = scanner.nextInt();
        s.addStock(increase);
        System.out.println("Increased stock by " + increase + " units.");
        System.out.println(s);

        System.out.print("Enter the number of stock units to sell: ");
        int sell = scanner.nextInt();
        if (s.sellStock(sell)) {
            System.out.println("Sold " + sell + " units.");
        } else {
            System.out.println("Failed to sell " + sell + " units.");
        }
        System.out.println(s);

        System.out.print("Enter the new price to change to: ");
        double newPrice = scanner.nextDouble();
        s.setPrice(newPrice);
        System.out.println("Changed price to " + newPrice);
        System.out.println(s);
    }

    public static void main(String[] args) {
    StockItem[] s = new StockItem[4];

        s[0] = new NavSys("NS101", 10, 99.99);
        s[1] = new AudioSystem("AS201", 5, 199.99, "Bose", "1234");
        s[2] = new VisualSystem("VS301", 8, 399.99, "50 inch", "1080p");
        s[3] = new PerformanceSystem("PS401", 3, 599.99, 400, 400);

        for (StockItem item : s) {
            itemInstance(item);
            System.out.println("----------------------------------");
        }
    }
}