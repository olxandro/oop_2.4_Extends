package animals;

public class Amphibian extends Animal {

    public Amphibian(String name, Integer age, String livingEnvironment) {
        super(name, age, livingEnvironment);
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
        System.out.println("меня зовут "+getName()+ " и Я люблю охотиться");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}