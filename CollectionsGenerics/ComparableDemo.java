import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Stud implements Comparable<Stud>{

    int rollno,marks;
    String name;

    public Stud(int rollno, int marks, String name){
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Stud [rollno=" + rollno + ", marks=" + marks+ ", Name = "+ name+"]";
    }

    // public int compareTo(Stud s){
    //     return marks>s.marks?1:-1;                   //""compare the marks
    // }
    public int compareTo(Stud s){                       //compare with lenght the name
        return name.length()>s.name.length()?1:-1;
    }
}


public class ComparableDemo {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23,55,"Mahesh"));
        studs.add(new Stud(24,30,"Sony"));
        studs.add(new Stud(25,21,"Larry"));
        studs.add(new Stud(26,90,"Manish"));
        
        Collections.sort(studs);                        // to use standared comparetom option

        Collections.sort(studs, (i,j) -> i.marks>j.marks?1:-1);     //to use the designed comparison in the lambda experession

        for (Stud s:studs)
        {
            System.out.println(s);
        }
    }
}
