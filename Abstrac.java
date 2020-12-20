abstract class Human{ //we can also do ' class Human'

//  if we dont want to define a method , make mit abstract
    public abstract void eat();

    public void walk(){

    }
}

class Man extends Human{
    public void eat(){

    }
}

public class Abstrac {

    public static void main(String[] args) {
        // Human obj = new Human(); cannot createa object of human but can create the following
        
        Human obj = new Man();
    }
    
}


//if we abstracted a class we cannot use it in a method
