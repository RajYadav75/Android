package in.raj.adapter;

public class ChatItems {
    int personImage;
    String personName;

    public ChatItems(int personImage, String name) {
        this.personImage = personImage;
        this.personName = name;
    }

    public int getPersonImage() {
        return personImage;
    }

    public String getPersonName() {
        return personName;
    }
}
