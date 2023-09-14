package zooanimals;

public class Animal {
    public String animalName;
    public int[] numberOfAnimals;
    public boolean aggressiveOrNot;
    public String animalSound;
    public void printNumberOfAnimals()  {
        System.out.println("This comes in packs, This this the number of packs ");

        for (int i= 0; i < numberOfAnimals.length; i++) {
            System.out.println( numberOfAnimals[i]);
        }

    }
    public void animalIntroduction() {
        System.out.println("This is A " + animalName + " and it makes this sound " + animalSound);
    }

}
