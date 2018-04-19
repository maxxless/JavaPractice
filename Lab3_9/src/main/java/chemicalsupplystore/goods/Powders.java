package chemicalsupplystore.goods;

public final class Powders extends Goods {

    private String material;
    private double weight;
    private String colour;


    public Powders(final String name, final double price, final int amount, final GoodsColour goodsColour, final GoodsType goodsType, final String material, final double weight, final String colour) {
        super(name, price, amount, goodsType, goodsColour);
        setMaterial(material);
        setWeight(weight);
        setColour(colour);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "Weight" + "," + "Material";
    }

    public String toCVS() {
        return super.toCVS() + "," + getWeight() + "," + getMaterial();
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Material = "
                + getMaterial() + " Weight = " + getWeight() + " Colour = " + getColour() + " Amount = " + getAmount()
                + " Price = " + getPrice();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        if (material.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        if (weight < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.weight = weight;
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
