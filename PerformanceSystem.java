package Assignment;

public class PerformanceSystem extends StockItem {
    private int horsepower;
    private int torque;

    public PerformanceSystem(String stockCode, int quantity, double price, int horsepower, int torque) {
        super(stockCode, quantity, price);
        this.horsepower = horsepower;
        this.torque = torque;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    @Override
    public String getStockName() {
        return "Performance System";
    }

    @Override
    public String getStockDescription() {
        return "Car performance system with " + horsepower + " horsepower and " + torque + " torque";}

    @Override
    public double getPriceWithoutVAT() {
        return super.getPriceWithoutVAT();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() +
                "\nDescription: " + getStockDescription() +
                "\nStockCode: " + getStockCode() +
                "\nPriceWithoutVAT: " + getPriceWithoutVAT() +
                "\nPriceWithVAT: " + getPriceWithVAT() +
                "\nTotal unit in stock: " + getQuantity();
    }

    @Override
    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 1 || quantityInStock > 100) {
            System.out.println("Error: Invalid quantity");
        } else {
            super.setQuantityInStock(quantityInStock);
        }
    }

    @Override
    public boolean addStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Invalid amount");
            return false;
        }
        if (getQuantityInStock() + amount > 100) {
            System.out.println("Error: Stock level exceeds maximum limit");
            return false;
        }
        super.addStock(amount);
        return true;
    }

    @Override
    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Invalid amount");
            return false;
        }
        if (getQuantityInStock() - amount < 0) {
            System.out.println("Error: Insufficient stock");
            return false;
        }
        super.sellStock(amount);
        return true;
    }
}