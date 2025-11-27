class parent {
    private String name;
    private String relation;
    
    public parent(String name,String relation){
        this.name = name ;
        this.relation = relation;
    }

    public String getName(){
        return name;
    }

    public String getRelation(){
        return relation;
    }

    public void hobby(){
        System.out.println("Plays a role of parent.");
    }

}

class child extends parent{
    
    int age;
    String grade;

    public child (String name , String relation){

        super(name, relation);
    }

    @Override
    public void hobby(){
        System.out.println(getName()+" plays a guitar.");
    }

}

public class main{
    public static void main (String[] args) {
        
    
        parent P1 = new parent("Ali","Ustaad" );
        child c1 = new child("Ashar","student");
        c1.age = 19;
        c1.grade = "Twelve";

        System.out.println(P1.getName() + " is " +P1.getRelation()+" and ");
        P1.hobby();
        System.out.println(c1.getName() + " is " +c1.getRelation()+" and ");
        c1.hobby();

    }

}

  