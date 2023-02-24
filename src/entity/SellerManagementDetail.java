package entity;


import constant.ProductType;

public class SellerManagementDetail {
    private ProductType productType;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SellerManagementDetail{" +
                "productType=" + productType +
                ", quantity=" + quantity +
                '}';
    }
}
