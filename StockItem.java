package Assignment;

public class StockItem {
    String stockCode;
    private int quantityInStock;
    double price;
    private static final double VAT_RATE = 17.5;

    public StockItem(String stockCode, int quantityInStock, double price) {
        this.stockCode = stockCode;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVAT() {
        return price + (price * VAT_RATE / 100);
    }

    public String getStockName() {
        return "Unknown Stock Name";
    }

    public String getStockDescription() {
        return "Unknown Stock Description";
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 1 || quantityInStock > 100) {
            System.out.println("Error: Invalid quantity");
        } else {
            this.quantityInStock = quantityInStock;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean addStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Invalid amount");
            return false;
        }
        if (quantityInStock + amount > 100) {
            System.out.println("Error: Stock level exceeds maximum limit");
            return false;
        }
        quantityInStock += amount;
        return true;
    }

    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Error: Invalid amount");
            return false;
        }
        if (quantityInStock - amount < 0) {
            System.out.println("Error: Insufficient stock");
            return false;
        }
        quantityInStock -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() + " Stock Name Description: " + getStockDescription() + " StockCode: " + getStockCode() + " PriceWithoutVAT: " + getPrice() + " PriceWithVAT: " + getPriceWithVAT() + " Total unit in stock: " + getQuantityInStock();
    }

    public double getPriceWithoutVAT() {
        return price;
    }

    public int getQuantity() {
        return quantityInStock;
    }
}