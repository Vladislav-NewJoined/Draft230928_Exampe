// источник: https://www.cyberforum.ru/java-j2se/thread1981757.html
package Class25;

public class Animal {
    String name;
    String type;
    String voice;
    int age;
    int speed;

    public Animal(String name, String type, String voice, int age, int speed) {
        this.name = name;
        this.type = type;
        this.voice = voice;
        this.age = age;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVoice() {
        return voice;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }
}
