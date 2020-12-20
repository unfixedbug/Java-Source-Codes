public class wrapper {

    public static void main(String[] args) {
        
        int i =5; //primitiveVariable
        Integer ii = new Integer(i); // if i put primitive value inside object it is called 'Boxing' - 'Wrapping'
        
        int j = ii.intValue(); //unboxing - 'unwrapping'

        Integer value = i; //autoboxing
        
        int k = value; // autounboxing

        // primitive works faster than wrapper class
        // some frameworks only use wrapper classes; skip for now
        
    
    }
    
}
