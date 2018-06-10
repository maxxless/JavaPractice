package fruit;

public final class Fruit {
	
    private String name;
    private String colour;
    private int quantity;
    private double price;
    private double weight;
        
	private static double generalWeight = 0.0;
	
	public Fruit() {
		name = "Apple";
		colour = "Red";
		quantity = 2;
		price = 18.5;
		weight = 0.25;
		generalWeight += (weight*quantity);
	}
	
	public Fruit(String name, String colour, int quantity, double price){
		setName(name);
		setColour(colour);
		setQuantity(quantity);
		setPrice(price);
		weight = 0.87;
		generalWeight += (weight*quantity);
	}
	
	public Fruit(String name, String colour, int quantity, double price, double weight){
		setName(name);
		setColour(colour);
		setQuantity(quantity);
		setPrice(price);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
	        generalWeight = generalWeight - this.weight + weight;
		this.weight=weight;
	}
	
        @Override
     	public String toString() {
		return getColour() + " " + getName() + " in the quantity of " + getQuantity() + " weighs " + getWeight() + " kg and thus costs " + getPrice() + " hrn." ;
        }
	
	public static void printStaticSum() {
		System.out.println("Now total fruits' weight is " + generalWeight + " kg.");
	}
	
	public void printSum() {
		System.out.println("Total weight of this " + name + "s is " + weight + " kg.");
	}
	
	public void resetValues(String name, String colour, int quantity, double price, double weight) {
		setName(name);
		setColour(colour);
		setQuantity(quantity);
		setPrice(price);
		setWeight(weight);
	}

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		Fruit pineapple = new Fruit("Pineapple", "Brown", 1, 110.0);
		Fruit pear = new Fruit("Pear", "Yellow", 5, 22.0, 1.35);
		
		System.out.println(apple.toString());
		System.out.println(pineapple.toString());
		System.out.println(pear.toString());
		
		Fruit.printStaticSum();
		
		apple.printSum();
		pineapple.printSum();
		pear.printSum();
	}
}
