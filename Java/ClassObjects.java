class Animal{
    int numLegs;
    Animal(int numLegs){
        this.numLegs = numLegs;
    }
    public void display(){
        System.out.print("Numlegs : " + this.numLegs);
    }
}

class MainClass{
    public static void main(String[] args){
        Animal ani = new Animal(4);
        ani.display();
    }
}