package animals;

import java.util.Objects;

public class Fly extends Bird {
    private String movement;

    public Fly(String name, Integer age, String livingEnvironment, String movement) {
        super(name, age, livingEnvironment);
        setMovement(movement);

    }
    public void flying(){
        System.out.println("меня зовут "+getName()+ " и Я люблю летать");
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = Objects.requireNonNullElse(movement,"летающие");
    }

    @Override
    public String toString() {
        return super.toString() +
                "тип передвижения " + movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fly flying = (Fly) o;
        return Objects.equals(movement, flying.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }
}