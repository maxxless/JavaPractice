package chemicalsupplystore.goods;

public final class Powders extends Goods {
    
    private final GoodsType goodsType = GoodsType.POWDERS;
    private final GoodsColour goodsColour = GoodsColour.BLACK;
    private String material;
    private double weight;
    private String colour;


    public Powders(String name, double price, int amount, String material, double weight, String colour) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setMaterial(material);
        setWeight(weight);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Material = " + material + " Weight = " + weight + " Colour = " + colour + " Amount = " + amount + " Price = " + price;
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
