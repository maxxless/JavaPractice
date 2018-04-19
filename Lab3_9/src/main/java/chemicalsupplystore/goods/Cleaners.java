package chemicalsupplystore.goods;

public final class Cleaners extends Goods {

    public Cleaners(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType) {
        super(name, price, amount, goodsType, goodsColour);
    }

    public String getHeaders() {
        return super.getHeaders();
    }

    public String toCVS() {
        return super.toCVS();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Amount = "
                + getAmount() + " Price = " + getPrice();
    }

}
