package chemicalsupplystore.goods;

public final class LaundryDetergents extends Goods {
    
    private final GoodsType goodsType = GoodsType.LAUNDRY_DETERGENTS;
    private final GoodsColour goodsColour = GoodsColour.RED;
    private double density;
    private double volume;


    public LaundryDetergents(String name, double price, int amount, double density, double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setDensity(density);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Density = " + density + " Volume=" + volume + " Amount = " + amount + " Price = " + price;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
