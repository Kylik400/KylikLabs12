import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimon on 02.08.2015.
 */
public class ClassInput extends Lists {

    private static double BuyIn = 0;
    private static double SaleIn = 0;
    private static double Count = 0;
    private boolean value;



    public ClassInput() throws IOException {
        System.out.println("Введите название конвертируемой валюты");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String InputName1 = br.readLine();

        for(int i = 0; i<getCurencyHolder().size();i++) {

            if (InputName1.equals(getCurencyHolder().get(i))) {

                BuyIn = getBuyHolder().get(i);
                SaleIn = getSaleHolder().get(i);
                value = true;

            }
            else {
                System.out.println("Введенный тип валюты не найден");
                value = false;
            }
        }

        System.out.println("Введите колличество конвертируемыых единиц");

        String Number = br.readLine();
        double numb = Double.parseDouble(Number);

        Count = numb;

        System.out.println("Введите то во что хотите конвертировать");

        String InputName2 = br.readLine();

        if(value == true) {
            System.out.println("Полученное значение ===>   " + GetValue());

        }
            else System.out.println("Введенный тип валюты не найден");

    }

    public static double GetValue(){
        double v = Count * SaleIn;
        return v;
    }





}
