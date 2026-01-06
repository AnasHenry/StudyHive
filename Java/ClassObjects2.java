class Animal{
    int numLegs;
    String breed;
    Animal(int numLegs){
        this.numLegs = numLegs;
    }
    Animal(int numLegs, String breed){
        this.numLegs = numLegs;
        this.breed = breed;
    }
    public void display(){
        System.out.println("Numlegs : " + this.numLegs);
        System.out.println("Breed : " + this.breed);
    }
}

class MainClass{
    public static void main(String[] args){
        Animal ani = new Animal(4,"German Sheperd");
        Animal anima = new Animal(6);
        anima.breed = "Dalmation";
        ani.display();
        anima.display();
    }
}