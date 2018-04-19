package chemicalsupplystore.goods;

public final class LaundryDetergents extends Goods {

    private double density;
    private double volume;

    public LaundryDetergents(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType, final double density, final double volume) {
        super(name, price, amount, goodsType, goodsColour);
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
}
