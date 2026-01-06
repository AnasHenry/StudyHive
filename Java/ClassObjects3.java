class Animal {
    int n = 90;
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class ClassObjects3 {
    public static void main(String[] args) {
        Dog a = new Dog();
        System.out.print(a.n);
        a.sound();
    }
}
