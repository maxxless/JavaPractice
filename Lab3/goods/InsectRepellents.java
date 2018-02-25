package chemicalsupplystore.goods;

public final class InsectRepellents extends Goods {
    
    private final GoodsType goodsType = GoodsType.INSECT_REPELLENTS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private double killZoneRadius;
    private double volume;


    public InsectRepellents(String name, double price, int amount, double killZoneRadius, double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setKillZoneRadius(killZoneRadius);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " KillZoneRadius = " + killZoneRadius + " Volume = " + volume + " Amount = " + amount + " Price = " + price;
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
