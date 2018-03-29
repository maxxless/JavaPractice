package chemicalsupplystore.goods;

public final class AirFresheners extends Goods {

    private final GoodsType goodsType = GoodsType.AIR_FRESHENERS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private String smell;
    private double volume;

    public AirFresheners(final String name, final double price, final int amount, final String smell, final double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setSmell(smell);
        setVolume(volume);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "Smell" + "," + "Volume";
    }

    public String toCVS() {
        return super.toCVS() + "," + getSmell() + "," + getVolume();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Smell = "
                + getSmell() + " Volume = " + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice();
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(final String smell) {
        if (smell.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.smell = smell;
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
