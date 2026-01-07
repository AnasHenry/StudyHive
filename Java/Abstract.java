//An abstract class is a class that cannot be instantiated and 
//may contain abstract and non-abstract methods.
abstract class Ab1{
    abstract void exec();
}

//Why Abstract Class: “Abstract classes are used when we want to provide a 
// common base with partial implementation and force subclasses to implement specific behavior.”

class Child extends Ab1{
    //Rule: Subclass must implement all abstract methods
    public void exec(){
        System.out.print("Execution in progress");
    }
}


class Abs{
    public static void main(String[] args){
        Child ch = new Child();
        ch.exec(); 
    }
}