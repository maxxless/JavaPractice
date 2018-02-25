package chemicalsupplystore.goods;

public final class Cleaners extends Goods {
    
    private final GoodsType goodsType = GoodsType.CLEANERS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;
    
    public Cleaners(String name, double price,int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        }

    @Override
    public String toString() {
        return "Name = " + name + " Type = " + goodsType + " Colour = " + goodsColour + " Amount = " + amount + " Price = " + price;
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
