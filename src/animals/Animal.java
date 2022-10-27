package animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private Integer age;
    private String livingEnvironment;

    public abstract void eat();

    public abstract void sleep();

    public abstract void going();

    public Animal(String name, Integer age, String livingEnvironment) {
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
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(age, animal.age) && Objects.equals(livingEnvironment, animal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }
}
