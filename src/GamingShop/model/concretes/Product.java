package GamingShop.model.concretes;

public class Product extends BaseEntity {
    private String productName;
    private int categoryId;
    private double unitPrice;
    private int unitsInStock;
    private boolean isCampaigned;

    public Product(String productName, int categoryId, double unitPrice, int unitsInStock, boolean isCampaigned) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.isCampaigned = isCampaigned;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }


    public boolean isCampaigned() {
        return isCampaigned;
    }

    public void setCampaigned(boolean campaigned) {
        isCampaigned = campaigned;
    }
}
