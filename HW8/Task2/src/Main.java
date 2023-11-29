import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int countPeople = 10;
        double mediumWeight = 0;
        int hevyWeightCount = 0;
        int [] weightPeople = new int[countPeople];
        for (int i = 0; i < weightPeople.length; i++) {
            weightPeople[i]=new Random().nextInt(40,100);
            mediumWeight+=weightPeople[i];
            if (weightPeople[i]>=60 && weightPeople[i]<=80){
                hevyWeightCount++;
            }
            System.out.print(" "+weightPeople[i]);
        }
        System.out.println("\n*****");
        System.out.println("Средний вес "+countPeople + " людей составляет: "+mediumWeight/weightPeople.length+ " кг");
        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг составвляет: "+hevyWeightCount+ " человек(а)");
    }
}
