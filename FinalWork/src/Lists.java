import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimon on 06.08.2015.
 */
public class Lists {



    private static final List<String> CURENCY_HOLDER = new ArrayList<>();
    public static List<String> getCurencyHolder() {
        return CURENCY_HOLDER;
    }
    public static void addCurrency(String currency) {CURENCY_HOLDER.add(currency);}

    public static void getCurInd(int z){ CURENCY_HOLDER.get(z);

    }

    private static final List<Double> BUY_HOLDER = new ArrayList<>();
    public static List<Double> getBuyHolder() {
        return BUY_HOLDER;}
    public static void addBuy(Double buy) {
        BUY_HOLDER.add(buy);
    }



    private static final List<Double> SALE_HOLDER = new ArrayList<>();
    public static List<Double> getSaleHolder() {
        return SALE_HOLDER;
    }
    public static void addSale(Double sale) {
        SALE_HOLDER.add(sale);
    }

}

