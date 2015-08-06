import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimon on 02.08.2015.
 */
public class ClassInput extends Lists {


    public ClassInput() throws IOException {
        System.out.println("Ввдеите название валюты");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String InputName = br.readLine();

        if(InputName.equals(getCurencyHolder().get(0))){
            
        }

        System.out.println("Введите колличество конвертируемыых единиц");
        String Number = br.readLine();
        int numb = Integer.parseInt(Number);
        System.out.println("Введите то во что хотите конвертировать");

    }
}
