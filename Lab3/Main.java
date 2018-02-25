package chemicalsupplystore;

import chemicalsupplystore.goods.Goods;
import static chemicalsupplystore.goods.SwitchMenu.Menu;
import java.util.List;

public class Main {

    public static void printList(List<Goods> List) {
        List.forEach((Goods x) -> {
            System.out.println(x.toString());
        });
    }
    
    
    public static void main(String[] args) {

        Menu();

    }    
}


    

