package chemicalsupplystore.goods;

public abstract class Goods {
    
    private String name;
    private double price;
    private int amount;

    public abstract GoodsType getGoodsType();
    public abstract GoodsColour getGoodsColour();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
