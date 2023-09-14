package zooanimals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.aggressiveOrNot = false;
        dog.animalName = "dog";
        dog.animalSound = "woof";
        dog.numberOfAnimals = new int[]{3,5,8};

      Animal lion = new Animal();
      lion.aggressiveOrNot = true;
      lion.animalName = "Lion";
      lion.animalSound = "ROAAARRRRR";
      lion.numberOfAnimals = new int[] {1,5,9};

      Animal snake = new Animal();
      snake.aggressiveOrNot = true;
      snake.animalName = "Snake";
      snake.animalSound = "sssssss";
      snake.numberOfAnimals = new int[] {8,6,4};

        dog.animalIntroduction();
        dog.printNumberOfAnimals();

        lion.animalIntroduction();
        lion.printNumberOfAnimals();

        snake.animalIntroduction();
        snake.printNumberOfAnimals();



    }
}
