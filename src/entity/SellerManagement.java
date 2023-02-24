package entity;

import java.util.Arrays;

public class SellerManagement {
    private Seller  seller;
    private SellerManagementDetail[] sellerManagementDetails;
    private int totalProduct;

    public SellerManagement(Seller seller, int sellerManagementDetails) {
        this.seller=seller;
        this.sellerManagementDetails=sellerManagementDetails;

        int tempTotal= 0;
        for (int i = 0; i < sellerManagementDetails.length; i++) {
            tempTotal+= sellerManagementDetails[i].getQuantity();

        }
        this.totalProduct=tempTotal;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public SellerManagementDetail[] getSellerManagementDetails() {
        return sellerManagementDetails;
    }

    public void setSellerManagementDetails(SellerManagementDetail[] sellerManagementDetails) {
        this.sellerManagementDetails = sellerManagementDetails;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    @Override
    public String toString() {
        return "SellerManagement{" +
                "seller=" + seller +
                ", sellerManagementDetails=" + Arrays.toString(sellerManagementDetails) +
                ", totalProduct=" + totalProduct +
                '}';
    }
}

