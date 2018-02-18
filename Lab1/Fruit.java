package fruit;

public final class Fruit {
	
    private String Name;
    private String Colour;
    private int Quantity;
    private double Price;
    private double Weight;
        
	private static double GeneralWeight = 0.0;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getColour() {
		return Colour;
	}
	
	public void setColour(String Colour) {
		this.Colour = Colour;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	
	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double Price) {
		this.Price = Price;
	}
	
	public double getWeight() {
		return Weight;
	}
	
	public void setWeight(double Weight) {
	        GeneralWeight = GeneralWeight - this.Weight + Weight;
		this.Weight=Weight;
	}
	
	private Fruit() {
		Name = "Apple";
		Colour = "Red";
		Quantity = 2;
		Price = 18.5;
		Weight = 0.25;
		GeneralWeight += (Weight*Quantity);
	}
	
	private Fruit(String Name, String Colour, int Quantity, double Price){
		setName(Name);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		Weight = 0.87;
		GeneralWeight += (Weight*Quantity);
	}
	
	private Fruit(String Name, String Colour, int Quantity, double Price, double Weight){
		setName(Name);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		setWeight(Weight);
	}
	
        @Override
     	public String toString() {
		return getColour() + " " + getName() + " in the quantity of " + getQuantity() + " weighs " + getWeight() + " kg and thus costs " + getPrice() + " hrn." ;
        }
	
	public static void printStaticSum() {
		System.out.println("Now total fruits' weight is " + GeneralWeight + " kg.");
	}
	
	public void printSum() {
		System.out.println("Total weight of this " + Name + "s is " + Weight + " kg.");
	}
	
	public void resetValues(String Name, String Colour, int Quantity, double Price, double Weight) {
		setName(Name);
		setColour(Colour);
		setQuantity(Quantity);
		setPrice(Price);
		setWeight(Weight);
	}

	public static void main(String[] args) {
		Fruit Apple = new Fruit();
		Fruit Pineapple = new Fruit("Pineapple", "Brown", 1, 110.0);
		Fruit Pear = new Fruit("Pear", "Yellow", 5, 22.0, 1.35);
		
		System.out.println(Apple.toString());
		System.out.println(Pineapple.toString());
		System.out.println(Pear.toString());
		
		Fruit.printStaticSum();
		
		Apple.printSum();
		Pineapple.printSum();
		Pear.printSum();
	}
}
