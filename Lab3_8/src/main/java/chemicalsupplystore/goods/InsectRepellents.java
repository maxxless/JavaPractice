package chemicalsupplystore.goods;

public final class InsectRepellents extends Goods {

    private double killZoneRadius;
    private double volume;

    public InsectRepellents(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType, final double killZoneRadius, final double volume) {
        super(name, price, amount, goodsType, goodsColour);
        setKillZoneRadius(killZoneRadius);
        setVolume(volume);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "Kill Zone Radius" + "," + "Volume";
    }

    public String toCVS() {
        return super.toCVS() + "," + getKillZoneRadius() + "," + getVolume();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour()
                + " KillZoneRadius = " + getKillZoneRadius() + " Volume = " + getVolume() + " Amount = " + getAmount()
                + " Price = " + getPrice();
    }

    public double getKillZoneRadius() {
        return killZoneRadius;
    }

    public void setKillZoneRadius(final double killZoneRadius) {
        if (killZoneRadius < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.killZoneRadius = killZoneRadius;
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
