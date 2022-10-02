package Animals;

public class Birds extends Animals{

    public Birds(String name, Integer age, String livingEnvironment) {
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
        System.out.println("меня зовут "+getName()+ " и Я люблю летать");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}