package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String eat;


    public Herbivore(String name, Integer age, String livingEnvironment, Integer speed, String eat) {
        super(name, age, livingEnvironment, speed);
        setEat(eat);
    }

    public String getEat() {
        return eat;
    }

    public final void setEat(String eat) {
        this.eat = Objects.requireNonNullElse(eat, "трава");
    }

    public void graze() {
        System.out.println("я пасусь на лугу и люблю " + getEat());
    }

    @Override
    public String toString() {
        return super.toString() + ", я ем " + eat;
    }
}
