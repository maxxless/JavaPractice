package chemicalsupplystore;

public class AirFresheners extends Goods {
    
    private final GoodsType goodsType = GoodsType.AIR_FRESHENERS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private String smell;
    private double volume;

    public AirFresheners(double price, String smell, double volume) {
        setPrice(price);
        setSmell(smell);
        setVolume(volume);
    }
    
    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
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
