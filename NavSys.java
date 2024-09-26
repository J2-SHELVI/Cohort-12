package Assignment;

public class NavSys extends StockItem {
    public NavSys(String stockCode, int totalUnitsInStock, double priceWithoutVAT) {
        super(stockCode, totalUnitsInStock, priceWithoutVAT);
    }

    @Override
    public String getStockName() {
        return "Navigation system";
    }

    @Override
    public String getStockDescription() {
        return "GeoVision Sat Nav";
    }

    @Override
    public String toString() {
        return super.toString();
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