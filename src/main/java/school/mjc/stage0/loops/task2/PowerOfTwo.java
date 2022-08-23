package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if (power>= 0){

            System.out.println(1);

        }

        if (power<0){

            System.out.println("too much power");

        }else{

            int pow = 1, product = 1;

            while (pow<=power){

                product = product * 2;
                
                pow++;

                System.out.println(product);

            }

        }

    }
}
