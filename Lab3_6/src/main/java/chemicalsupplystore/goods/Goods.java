package chemicalsupplystore.goods;

public abstract class Goods {

    private String name;
    private double price;
    private int amount;

    public Goods(final String name, final double price, final int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    protected Goods() {
    }

    public abstract GoodsType getGoodsType();

    public abstract GoodsColour getGoodsColour();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        if (price < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.amount = amount;
    }

}
