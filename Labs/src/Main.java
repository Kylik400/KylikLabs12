
public class Main {

    public static void main(String[] args) {


        int s[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int counter = 0;

        for (int i = 0; i < 10; i++) {


            if (s[i] == 0) {
                counter++;



            }

        }
        System.out.println("Колличество нулевых елементов в массиве s[] = " + counter);


        //Второе задание

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
        System.out.println("Максимальное значение массива q[] = " + max);


            //Третье задание

        int n = 67;
        byte u[] = new byte[4] ;

        for(int i  = 0; i < u.length;i++){

            u[i] = (byte) (n/4);
            System.out.println("Значение типа byte = " + (u[i]) );
        }

            //Четвертое задание



        }



    }





