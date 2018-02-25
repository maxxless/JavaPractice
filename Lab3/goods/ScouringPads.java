package chemicalsupplystore.goods;

public final class ScouringPads extends Goods {
    
    private final GoodsType goodsType = GoodsType.SCOURING_PADS;
    private final GoodsColour goodsColour = GoodsColour.YELLOW;
    private double rigidity;
    private String colour;


    public ScouringPads(String name, double price, int amount, double rigidity, String colour) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setRigidity(rigidity);
        setColour(colour);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Rigidity = " + rigidity + " Colour = " + colour + " Amount = " + amount + " Price = " + price;
    }

    public double getRigidity() {
        return rigidity;
    }

    public void setRigidity(double rigidity) {
        this.rigidity = rigidity;
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

