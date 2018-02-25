package chemicalsupplystore;

public final class Customer {
    
    private String name;
    private String surname;
    private double availableAmountOfMoney;
    private int numberOfNecessaryGoods;

    public Customer() {
    }

    public Customer(String name, String surname, double availableAmountOfMoney, int numberOfNecessaryGoods) {
        setName(name);
        setSurname(surname);
        setAvailableAmountOfMoney(availableAmountOfMoney);
        setNumberOfNecessaryGoods(numberOfNecessaryGoods);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAvailableAmountOfMoney() {
        return availableAmountOfMoney;
    }

    public void setAvailableAmountOfMoney(double availableAmountOfMoney) {
        this.availableAmountOfMoney = availableAmountOfMoney;
    }

    public int getNumberOfNecessaryGoods() {
        return numberOfNecessaryGoods;
    }

    public void setNumberOfNecessaryGoods(int numberOfNecessaryGoods) {
        this.numberOfNecessaryGoods = numberOfNecessaryGoods;
    }
        
    
}
