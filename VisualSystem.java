package Assignment;

public class VisualSystem extends StockItem {
    private String screenSize;
    private String resolution;

    public VisualSystem(String stockCode, int quantity, double price, String screenSize, String resolution) {
        super(stockCode, quantity, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String getStockName() {
        return "Visual System";
    }

    @Override
    public String getStockDescription() {
        return "Car visual system with " + screenSize + " screen size and " + resolution + " resolution";
    }

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