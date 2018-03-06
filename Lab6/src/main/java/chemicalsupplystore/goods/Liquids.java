package chemicalsupplystore.goods;

public final class Liquids extends Goods {

    private final GoodsType goodsType = GoodsType.LIQUIDS;
    private final GoodsColour goodsColour = GoodsColour.BLUE;
    private double volume;
    private String colour;
    private double density;

    public Liquids(final String name, final double price, final int amount, final double volume, final String colour, final double density) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setVolume(volume);
        setColour(colour);
        setDensity(density);
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

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }

    @Override
    public GoodsColour getGoodsColour() {
        return goodsColour;
    }
}
