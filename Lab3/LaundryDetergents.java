package chemicalsupplystore;

public class LaundryDetergents extends Goods {
    
    private final GoodsType goodsType = GoodsType.LAUNDRY_DETERGENTS;
    private final GoodsColour goodsColour = GoodsColour.RED;
    private double density;
    private double volume;

    public LaundryDetergents(double price, double density, double volume) {
        setPrice(price);
        this.density = density;
        this.volume = volume;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
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
