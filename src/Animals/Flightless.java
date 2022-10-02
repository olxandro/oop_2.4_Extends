package Animals;

import java.util.Objects;

public class Flightless extends Birds{

    private String movement;
    public Flightless(String name, Integer age, String livingEnvironment,String movement) {
        super(name, age, livingEnvironment);
        setMovement(movement);

    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = Objects.requireNonNullElse(movement,"нелетающие");
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
        Flightless that = (Flightless) o;
        return Objects.equals(movement, that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }

}
