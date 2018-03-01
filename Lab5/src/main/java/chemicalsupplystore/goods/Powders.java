package chemicalsupplystore.goods;

public final class Powders extends Goods {
    
    private final GoodsType goodsType = GoodsType.POWDERS;
    private final GoodsColour goodsColour = GoodsColour.BLACK;
    private String material;
    private double weight;
    private String colour;


    public Powders(final String name, final double price, final int amount, final String material, final double weight, final String colour) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setMaterial(material);
        setWeight(weight);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Material = " + getMaterial() + " Weight = " + getWeight() + " Colour = " + getColour() + " Amount = " + getAmount() + " Price = " + getPrice();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }
    
    @Override
    public GoodsColour getGoodsColour() {
        return goodsColour;
    }
    
}
