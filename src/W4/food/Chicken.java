package W4.food;

public class Chicken extends Animal implements Edible {
    public Chicken() {

    }

    @Override
    public String sound() {
        return "Chicken: Buck Buck";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it and put sauce on it (but not too spicy)";
    }
}
