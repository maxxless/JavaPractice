package chemicalsupplystore;

public class InsectRepellents extends Goods {
    
    private final GoodsType goodsType = GoodsType.INSECT_REPELLENTS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private double killZoneRadius;
    private double volume;

    public InsectRepellents(double price, double killZoneRadius, double volume) {
        setPrice(price);
        this.killZoneRadius = killZoneRadius;
        this.volume = volume;
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
