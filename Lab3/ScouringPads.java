package chemicalsupplystore;

public class ScouringPads extends Goods {
    
    private final GoodsType goodsType = GoodsType.SCOURING_PADS;
    private final GoodsColour goodsColour = GoodsColour.YELLOW;
    private String material;
    private double rigidity;
    private double weight;
    private String colour;

    public ScouringPads(double price, String material, double rigidity, double weight, String colour) {
        setPrice(price);
        this.material = material;
        this.rigidity = rigidity;
        this.weight = weight;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getRigidity() {
        return rigidity;
    }

    public void setRigidity(double rigidity) {
        this.rigidity = rigidity;
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

