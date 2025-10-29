package in.raj.adaptordemothree;

public class Animal {
    String animalName;
    int animalImage;

    public Animal(String animalName,int animalImage) {
        this.animalName = animalName;
        this.animalImage = animalImage;
    }

    public int getAnimalImage(){
        return animalImage;
    }

    public String getAnimalName(){
        return animalName;
    }
}
