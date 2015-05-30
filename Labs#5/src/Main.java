import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Source_it_6 on 26.05.2015.
 */
public class Main {



    public static void main(String[] args) throws IOException {
        Point s = new Point();
        Field n = new Field();

        s.setX(2.1);
        s.setY(4.6);

        BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));

        




        if (s.getX()> 0 && s.getY()>0)
            System.out.println(n.getB());

        if (s.getX()< 0 && s.getY()<0)
            System.out.println(n.getZ());

        if (s.getX()< 0 && s.getY()>0)
            System.out.println(n.getA());

        if (s.getX()> 0 && s.getY()<0)
            System.out.println(n.getB());



    }
    }

