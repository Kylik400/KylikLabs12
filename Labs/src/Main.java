import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int s[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int counter = 0;

        for (int i = 0; i < 10; i++) {


            if (s[i] == 0) {
                counter++;

            }

        }
        System.out.println("����������� ������� ��������� � ������� s[] = " + counter);


        //������ �������

        int q[] = {2, 5, 6, 7, 8};

        int max = 0;
        int t = 0;


        for (int j = 0; j < q.length; j++) {

            max = q[0];
            t = q[j];


            if (max < t) {

                max = t;

            }
        }
        System.out.println("������������ �������� ������� q[] = " + max);


        //������ �������

        int n = 67;
        byte u[] = new byte[4] ;

        for(int i  = 0; i < u.length;i++){

            u[i] = (byte) (n/4);
            System.out.println("�������� ���� byte = " + (u[i]) );
        }




            //��������� �������

        int[][] p = new int[8][5];


        Random r = new Random();

        int r1 = r.nextInt(100);

        if(r1<10)
            r1 = 10;

        for(int i = 0; i<8;i++) {
            for ( int j = 0; j < 5; j++)

                p[i][j] = r1;

            System.out.print("��������� �����" + p[i][j] + " ");
            System.out.println();
        }




    }



    }





