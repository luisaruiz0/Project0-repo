//Luis Ruiz
//CS1400
//Assignment 5
//November 15, 2021

public class Demo 
{
    public static void main(String[] args)
    {
        ///new person
        Person p= new Person("",0,"");
        p.setName("Peter");
        p.setAge(20);
        p.setFavoriteFood("chiceken nuggests");
        System.out.println(p);
        
        
        Person r= new Person("",0,"");
        r.setName("Reese");
        r.setAge(21);
        r.setFavoriteFood("Pizza");
        System.out.println(r);

        //new superhero
        SuperHero g= new SuperHero("George",24,"spatgehtti","Gravityman",
        "controling the force of gravity","See you in Space");
        System.out.println(g);
        g.catchVillain();
        g.speak();


        SuperHero d= new SuperHero("David",30,"spatgehtti","Dr.D",
        "Super Strength","SMASH!!");
        System.out.println(d);
        d.catchVillain();
        d.speak();

        System.out.println("Total amount of villains caught: "+d.villainsCaught());
        
        if(r.equals(p))
        {
            System.out.println("They are same person.");
        }
        else
        {
            System.out.println("They are not the same person.");
        }
        if(g.equals(d))
        {
            System.out.println("They are same Super Hero.");
        }
        else
        {
            System.out.println("They are not the same Super Hero.");
        }
        
    }
    
}
