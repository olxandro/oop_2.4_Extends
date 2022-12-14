package animals;

import java.util.Objects;

public class Mammal extends Animal {
    private Integer speed;

    public final Integer getSpeed() {
        return speed;
    }

    public final void setSpeed(Integer speed) {
        if (speed != null && speed <= 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    public Mammal(String name, Integer age, String livingEnvironment, Integer speed) {
        super(name, age, livingEnvironment);
        setSpeed(speed);

    }

    @Override
    public final void eat() {
        System.out.println("меня зовут "+getName()+ " и Я люблю есть");
    }

    @Override
    public final void sleep() {
        System.out.println("меня зовут "+getName()+ " и Я люблю спать");
    }

    @Override
    public final void going() {
        System.out.println("меня зовут "+getName()+ " и Я люблю гулять");
    }
    @Override
    public String toString() {
        return super.toString() + ", моя скорость " + speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(speed, mammal.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }
}
