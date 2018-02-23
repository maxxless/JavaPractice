package chemicalsupplystore;

public class Liquids extends Goods {
    
    private final GoodsType goodsType = GoodsType.LIQUIDS;
    private final GoodsColour goodsColour = GoodsColour.BLUE;
    private double volume;
    private String colour;
    private double density;

    public Liquids(double price, double volume, String colour, double density) {
        setPrice(price);
        this.volume = volume;
        this.colour = colour;
        this.density = density;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
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
