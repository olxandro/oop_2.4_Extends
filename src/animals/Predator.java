package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String eat;


    public Predator(String name, Integer age, String livingEnvironment, Integer speed, String eat) {
        super(name, age, livingEnvironment, speed);
        setEat(eat);
    }

    public String getEat() {
        return eat;
    }

    public final void setEat(String eat) {
        this.eat = Objects.requireNonNullElse(eat, "мясо");
    }

    public void hunting() {
        System.out.println("я люблю охотиться");
    }

    @Override
    public String toString() {
        return super.toString() + ", я ем " + eat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predators = (Predator) o;
        return Objects.equals(eat, predators.eat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eat);
    }
}
