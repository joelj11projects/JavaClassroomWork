public class iterationA {


    public static void main(String[] args) {

        int[] val  = new int[10];

        for (int i = 0; i<val.length; i++){

            val[i] = i+1;

            System.out.println(val[i]);

        }

        System.out.println("New loop:");

        for(int i = 0; i<val.length; i++){

            System.out.println(val[2]*10);

        }

    }

}


