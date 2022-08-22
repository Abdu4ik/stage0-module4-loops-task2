package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int num = multiplyByAndToInclusive ;

        while (num!=0){

            if (multiplyByAndToInclusive<0) {

                num++;
                System.out.println(-1*num * multiplyByAndToInclusive);

            }else{

                num--;
                System.out.println(num * multiplyByAndToInclusive);

            }

        }

    }
}
