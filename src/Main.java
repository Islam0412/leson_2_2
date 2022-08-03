import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(word(56, 37));
        System.out.println(word(55, 36));
        System.out.println(word(56, 34));
        System.out.println(word(78, 32));
        System.out.println(word(52, 39));
        System.out.println(word(generateRandomAge(),48));
    }


    public static String word(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "you can go for a walk";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "you can go for a walk";
        } else {
            return "stay home";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int pox = random.nextInt(1000000);
        return pox;
    }
}