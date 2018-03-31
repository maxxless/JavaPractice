package chemicalsupplystore.goods;

public class Goods {

    private Integer id;

    private String name;
    private double price;
    private int amount;
    private GoodsType goodsType;
    private GoodsColour goodsColour;

    public Goods(final String name, final double price, final int amount, final GoodsType goodsType, final GoodsColour goodsColour) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public Goods() {
    }

    public String getHeaders() {
        return "Name" + "," + "Price" + "," + "Amount" + "," + "Type" + "," + "Colour";
    }

    public String toCVS() {
        return getName() + "," + getPrice() + "," + getAmount() + "," + getGoodsType() + "," + getGoodsColour();
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(final GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public GoodsColour getGoodsColour() {
        return goodsColour;
    }

    public void setGoodsColour(final GoodsColour goodsColour) {
        this.goodsColour = goodsColour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

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
