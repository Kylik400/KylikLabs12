import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


//       /**/ int s[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
//        int counter = 0;
//
//        for (int i = 0; i < 10; i++) {
//
//
//            if (s[i] == 0) {
//                counter++;
//
//            }
//
//        }
//        System.out.println("����������� ������� ��������� � ������� s[] = " + counter);
//
//
//        //������ �������
//
//        int q[] = {2, 5, 6, 7, 8};
//
//        int max = 0;
//        int t = 0;
//
//
//        for (int j = 0; j < q.length; j++) {
//
//            max = q[0];
//            t = q[j];
//
//
//            if (max < t) {
//
//                max = t;
//
//            }
//        }
//        System.out.println("������������ �������� ������� q[] = " + max);
//
//
//        //������ �������
//
//        int n = 67;
//        byte u[] = new byte[4] ;
//
//        for(int i  = 0; i < u.length;i++){
//
//            u[i] = (byte) (n/4);
//            System.out.println("�������� ���� byte = " + (u[i]) );
//        }
//
//
//
//
//            //����� �������
//
//        int[][] p = new int[8][5];
//
//        Random r = new Random();
//
//        for(int i = 0; i<8;i++) {
//
//            for ( int j = 0; j < 5; j++) {
//
//                int r1 = r.nextInt(89)+ 10;
//
//                p[i][j] = r1;
//
//                System.out.print("��������� ����� " + p[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//            //������ �������
//
//        int w[][] = new int [3][4];
//        int e[][] = new int [6][10];
//
//        int counter1 = 0;


        //�������� �������
        //1)

        //  int[] a = {0,1,2,3,4,5,6,7,8,9};

        //for(int i = 0; i< a.length; i++) {


        // int b = a[i];

        // System.out.println("������� ������� " + a[i] + " = " + b);


        //int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        // for (int i = 0; arr.length/2 > i; i++) {
        // int tmp = arr[i];
        // arr[i] = arr[arr.length - i - 1];
        // arr[arr.length - i - 1] = tmp;
        //  }
        //  System.out.println(Arrays.toString(arr));


        //2)
//        Random m = new Random();
//
//        int r1 = m.nextInt(9)+1;
//        int[][] b = new int[10][r1];
//        int c =5;
//        for(int i =0;i<10;i++) {
//            for (int j = 0; j < r1; j++) {
//
//                b[i][j] = c;
//
//                System.out.print("������ \"���������\" " + b[i][j]);
//            }
//            System.out.println();
//
//        }
        int k = 0;
        int v = 0;
        int y = 0;
        int x = 0;

        int counter3 = 0;

        for (int i = 0; i <= 23; i++) {
            k = i / 10;
            v = i % 10;
//            System.out.println(k + " " + v);
//
            for (int j = 0; j <= 59; j++) {

                x = j / 10;
                y = j % 10;

                System.out.println(k + " " + v + " : " + x + " " + y);

                if (k == y && v == x) {
                    counter3++;
                    System.out.println("������� " + counter3);
                }
            }

        }




    }
}







