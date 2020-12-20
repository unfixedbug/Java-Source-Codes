class Student{
    private int rollno;
    private String name;

    //getters and setters


    public void setRollno(int r){
        this.rollno = r;
        System.out.println("value changed");
    }

    public int getRollno(){
        System.out.println("user is accessing the value");
        return rollno;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("Dhiraj");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
    
}
