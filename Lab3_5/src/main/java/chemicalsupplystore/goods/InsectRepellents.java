package chemicalsupplystore.goods;

public final class InsectRepellents extends Goods {
    
    private final GoodsType goodsType = GoodsType.INSECT_REPELLENTS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private double killZoneRadius;
    private double volume;

    public InsectRepellents(final String name, final double price, final int amount, final double killZoneRadius, final double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setKillZoneRadius(killZoneRadius);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " KillZoneRadius = " + getKillZoneRadius() + " Volume = " + getVolume() + " Amount = " + getAmount() + " Price = " + getPrice();
    }

    public double getKillZoneRadius() {
        return killZoneRadius;
    }

    public void setKillZoneRadius(double killZoneRadius) {
        this.killZoneRadius = killZoneRadius;
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
