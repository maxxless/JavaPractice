package chemicalsupplystore.goods;

import javax.persistence.*;

@Entity
public class Goods {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "amount")
    private int amount;

    @Column(name = "goodsType")
    private GoodsType goodsType;

    @Column(name = "goodsColour")
    private GoodsColour goodsColour;


    public Goods(String name, double price, int amount, GoodsType goodsType, GoodsColour goodsColour) {
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

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public GoodsColour getGoodsColour() {
        return goodsColour;
    }

    public void setGoodsColour(GoodsColour goodsColour) {
        this.goodsColour = goodsColour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.amount = amount;
    }

}
