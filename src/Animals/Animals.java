package Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private Integer age;
    private String livingEnvironment;

    public abstract void eat();

    public abstract void sleep();

    public abstract void going();

    public Animals(String name, Integer age, String livingEnvironment) {
        setName(name);
        setAge(age);
        setLivingEnvironment(livingEnvironment);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = Objects.requireNonNullElse(name, "безымянный");
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(Integer age) {
        if (age != null && age <=0) {
            this.age = age;
        } else {
            this.age = 999999;
        }
    }

    public final String getLivingEnvironment() {
        return livingEnvironment;
    }

    public final void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "уточните среду обитания");
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ", мне " + age + ", лет" +
                ", моя среда обитания " + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name) && Objects.equals(age, animals.age) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }
}
