package chemicalsupplystore;

import java.util.ArrayList;

public abstract class Goods {
    
    private String type;
    private String manufacturer;
    double price;
    private int amount;
    private boolean availability;

    public abstract GoodsType getGoodsType();
    public abstract GoodsColour getGoodsColour();
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        amount += 1;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
}
