package Assignment;

public class AudioSystem extends StockItem {
    private String brand;
    private String modelNumber;

    public AudioSystem(String stockCode, int quantity, double price, String brand, String modelNumber) {
        super(stockCode, quantity, price);
        this.brand = brand;
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String getStockName() {
        return "Audio System";
    }

    @Override
    public String getStockDescription() {
        return "Car audio system with " + brand + " brand and model number " + modelNumber;
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