package First;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Point {

    private int x;
    private int y;


    public Point (int i, int j){
         x= i;
         y =j;
    }

    public Point () throws IOException {
        System.out.print("¬ведите ординату точки:");
        Scanner r = new Scanner(System.in);
        int sput = r.nextInt();
        if (sput < 0)
        System.out.print("¬ведите абсцисс точки:");
    }


}