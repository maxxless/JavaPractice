package chemicalsupplystore.goods;

import java.util.LinkedList;
import java.util.List;

public final class ChemicalSupplyStore {

    private String storeName;
    private String address;
    private int goodsAmount;
    private String workingHours;
    private List<Goods> goodsList = new LinkedList<>();

    public ChemicalSupplyStore(final String storeName, final String address, final int goodsAmount, final String workingHours) {
        setStoreName(storeName);
        setAddress(address);
        setGoodsAmount(goodsAmount);
        setWorkingHours(workingHours);
        setGoodsList(goodsList);
    }

    public static void printList(final List<Goods> list) {
        list.forEach((Goods x) -> {
            System.out.println(x.toString());
        });
    }

    @Override
    public String toString() {
        return "Store Name = " + getStoreName() + " Address = " + getAddress() + " Goods Amount = " + getGoodsAmount()
                + " Working Hours = " + getWorkingHours() + " Goods List = " + getGoodsList();
    }

    public void sortByPrice(final List<Goods> result) {
        result.sort((Goods t1, Goods t2) -> {
            if ((t1.getPrice() - t2.getPrice()) >= 0) {
                return 1;
            } else return -1;
        });
    }

    public List<Goods> findByGroup(final GoodsType goodsType, final GoodsColour goodsColour) {
        List<Goods> result = new LinkedList<>();

        goodsList.stream().filter((goodsList) -> ((goodsList.getGoodsType() == goodsType) || (goodsList.getGoodsColour() == goodsColour))).forEachOrdered((goodsList) -> {
            result.add(goodsList);
        });

        return result;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(final String storeName) {
        if (storeName.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        if (address.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.address = address;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(final int goodsAmount) {
        if (goodsAmount < 0) {
            throw new IllegalArgumentException("Negative number is invalid.");
        }
        this.goodsAmount = goodsAmount;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(final String workingHours) {
        if (workingHours.equals("")) {
            throw new IllegalArgumentException("Empty string is invalid.");
        }
        this.workingHours = workingHours;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(final List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods(final Goods goods) {
        this.goodsList.add(goods);
    }
}
