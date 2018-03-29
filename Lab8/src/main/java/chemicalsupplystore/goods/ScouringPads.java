package chemicalsupplystore.goods;

public final class ScouringPads extends Goods {

    private final GoodsType goodsType = GoodsType.SCOURING_PADS;
    private final GoodsColour goodsColour = GoodsColour.YELLOW;
    private double rigidity;
    private String colour;


    public ScouringPads(final String name, final double price, final int amount, final double rigidity, final String colour) {
        setName(name);
        setPrice(price);
        setAmount(amount);
        setRigidity(rigidity);
        setColour(colour);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "Rigidity";
    }

    public String toCVS() {
        return super.toCVS() + "," + getRigidity();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Rigidity = "
                + getRigidity() + " Colour = " + getColour() + " Amount = " + getAmount() + " Price = " + getPrice();
    }

    public double getRigidity() {
        return rigidity;
    }

    public void setRigidity(final double rigidity) {
        if (rigidity < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.rigidity = rigidity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        if (colour.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.colour = colour;
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

