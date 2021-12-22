public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "German Shepherd", 5);
        if (dog.getBreed().equals("German Shepherd") || dog.getBreed().equals("Rottweiler")) {
            dog.bark();
        }
    }
}
