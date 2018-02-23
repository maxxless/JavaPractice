package chemicalsupplystore;

public class Powders extends Goods {
    
    private final GoodsType goodsType = GoodsType.POWDERS;
    private final GoodsColour goodsColour = GoodsColour.BLACK;
    private String material;
    private double weight;
    private String colour;

    public Powders(double price, String material, double weight, String colour) {
        setPrice(price);
        this.material = material;
        this.weight = weight;
        this.colour = colour;
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
