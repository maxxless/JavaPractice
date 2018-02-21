package chemicalsupplystore;

import java.util.ArrayList;

public class ChemicalSupplyStore {
    
    private String storeName;
    private String address;
    private int goodsAmount;
    private String workingHours;
    private ArrayList goodsList;

    public ChemicalSupplyStore(String storeName, String address, int goodsAmount, String workingHours, ArrayList goodsList) {
		setStoreName(storeName);
		setAddress(address);
		setGoodsAmount(goodsAmount);
		setWorkingHours(workingHours);
		setGoodsList(goodsList);
    }
    
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public ArrayList getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList goodsList) {
        this.goodsList = goodsList;
    }

    public static void main(String[] args) {
        
    }
    
}
