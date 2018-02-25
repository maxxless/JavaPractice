package chemicalsupplystore.goods;

public final class Liquids extends Goods {
    
    private final GoodsType goodsType = GoodsType.LIQUIDS;
    private final GoodsColour goodsColour = GoodsColour.BLUE;
    private double volume;
    private String colour;
    private double density;


    public Liquids(String name, double price, int amount, double volume, String colour, double density) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setVolume(volume);
        setColour(colour);
        setDensity(density);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Volume=" + volume + " Colour = " + colour + " Density = " + density + " Amount = " + amount + " Price = " + price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
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
