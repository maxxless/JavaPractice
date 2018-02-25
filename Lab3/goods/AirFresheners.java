package chemicalsupplystore.goods;

public final class AirFresheners extends Goods {
    
    private final GoodsType goodsType = GoodsType.AIR_FRESHENERS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    private String smell;
    private double volume;



    public AirFresheners(String name, double price,int amount, String smell, double volume) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setSmell(smell);
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Smell = " + smell + " Volume = " + volume + " Amount = " + amount + " Price = " + price;
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
