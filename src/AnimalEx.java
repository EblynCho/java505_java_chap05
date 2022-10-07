public class AnimalEx {

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이");
        Cat cat = new Cat("고양이");

        dog.breathe();
        dog.sound();
        cat.breathe();
        cat.sound();
        System.out.println("----------------------");


//        추상 클래스 타입의 변수를 선언하는 것은 문제가 없음
        Animal animal;
//        animal = new Animal();
        animal = new Dog("멍멍이");
        animal.sound();

        animal = new Cat("고양이");
        animal.sound();

        animalSound(new Dog("멍멍이"));
        animalSound(new Cat("고양이"));

    }
}
