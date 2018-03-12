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

    public String getHeaders() {
        return super.getHeaders() + "," + "Density" + "," + "Volume";
    }

    public String toCVS() {
        return super.toCVS() + "," + getDensity() + "," + getVolume();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Density = "
                + getDensity() + " Volume=" + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice();
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(final double density) {
        if (density < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.density = density;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volume) {
        if (volume < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
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
