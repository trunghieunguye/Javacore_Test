package entity;

public class Seller extends Person implements Inputable{
    private int id;
    private int signingDate;
    private static int AUTO_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(int signingDate) {
        this.signingDate = signingDate;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", signingDate=" + signingDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        this.id = AUTO_ID;
        AUTO_ID++;

    }
}
