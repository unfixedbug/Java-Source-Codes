interface WWriter{
    void write();
}

class PPen implements WWriter{
    public void write(){
        System.out.println("im the ppen");
    }
 }

//we have to use 'implements', we cannot create the object of intertface,we cannot define method in interface.
class Writer{
    public void write(){
        
    }
}

class Pen{
    public void write(){
        System.out.println("Im a pen");
    }
}

class Pencil{
    public void write(){
        System.out.println("im a pencil");
    }
}

class Kit{
    public void dosomething(Pen p){
        p.write();
    }
    public void dothis(Pencil p){
        p.write();
    }
}


public class shorties {
    public static void main(String[] args) {
        Kit k = new Kit();
        Pen p = new Pen();
        Pencil pc = new Pencil();

        k.dothis(pc);
        k.dosomething(p);
    }
    
}
