package chemicalsupplystore.goods;

public final class LaundryDetergents extends Goods {
    
    private final GoodsType goodsType = GoodsType.LAUNDRY_DETERGENTS;
    private final GoodsColour goodsColour = GoodsColour.RED;
    private double density;
    private double volume;


    public LaundryDetergents(final String name, final double price, final int amount, final double density, final double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setDensity(density);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Density = " + getDensity() + " Volume=" + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice();
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
