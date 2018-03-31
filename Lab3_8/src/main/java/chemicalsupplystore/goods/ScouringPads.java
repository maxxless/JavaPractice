package chemicalsupplystore.goods;

public final class ScouringPads extends Goods {

    private double rigidity;
    private String colour;


    public ScouringPads(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType, final double rigidity, final String colour) {
        super(name, price, amount, goodsType, goodsColour);
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
}

