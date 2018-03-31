package chemicalsupplystore.goods;

public final class Liquids extends Goods {

    private double volume;
    private String colour;
    private double density;

    public Liquids(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType, final double volume, final String colour, final double density) {
        super(name, price, amount, goodsType, goodsColour);
        setVolume(volume);
        setColour(colour);
        setDensity(density);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "Density" + "," + "Volume";
    }

    public String toCVS() {
        return super.toCVS() + "," + getDensity() + "," + getVolume();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Volume="
                + getVolume() + " Colour = " + getColour() + " Density = " + getDensity() + " Amount = " + getAmount()
                + " Price = " + getPrice();
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

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        if (colour.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.colour = colour;
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

}
