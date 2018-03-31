package chemicalsupplystore;

public final class Customer {

    private String name;
    private String surname;
    private double availableAmountOfMoney;
    private int numberOfNecessaryGoods;

    public Customer(final String name, final String surname, final double availableAmountOfMoney, final int numberOfNecessaryGoods) {
        setName(name);
        setSurname(surname);
        setAvailableAmountOfMoney(availableAmountOfMoney);
        setNumberOfNecessaryGoods(numberOfNecessaryGoods);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Surname = " + getSurname() + " Available Amount Of Money = "
                + getAvailableAmountOfMoney() + " Number Of Necessary Goods = " + getNumberOfNecessaryGoods();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        if (surname.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.surname = surname;
    }

    public double getAvailableAmountOfMoney() {
        return availableAmountOfMoney;
    }

    public void setAvailableAmountOfMoney(final double availableAmountOfMoney) {
        if (availableAmountOfMoney < 0.0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.availableAmountOfMoney = availableAmountOfMoney;
    }

    public int getNumberOfNecessaryGoods() {
        return numberOfNecessaryGoods;
    }

    public void setNumberOfNecessaryGoods(final int numberOfNecessaryGoods) {
        if (numberOfNecessaryGoods < 0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.numberOfNecessaryGoods = numberOfNecessaryGoods;
    }


}
