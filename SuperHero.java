//Luis Ruiz
//CS1400
//Assignment 5
//November 15, 2021

public class SuperHero extends Person
{
    
    public SuperHero() 
    {
        super("",0,"");   
    }
    private String superheroname;
    private String superpower;
    private String catchphrase;
    public  static int totalNumberVillainsCaught =0;
    
    
    
    public SuperHero(String name, int age, String favoriteFood, 
    String superheroname, String superpower, String catchphrase)
    {
        super(name,age,favoriteFood);

        this.superheroname=superheroname;
        this.superpower= superpower;
        this.catchphrase=catchphrase;
        
    }
    

    public void setSuperHeroName(String superheroname)
    {
        this.superheroname=superheroname;
    }
    public String getSuperHeroName()
    {
        return superheroname;
    }
    public void setSuperPower(String superpower)
    {
        this.superpower=superpower;
    }
    public String getSuperPower()
    {
        return superpower;
    }
    public void setCatchPhrase(String catchphrase)
    {
        this.catchphrase=catchphrase;
    }
    public String getCatchPhrase()
    {
        return catchphrase;
    }
    
    public void speak()
    {
        
        System.out.println(catchphrase+"    BOOOM!!!!!");
    }
    
    public void catchVillain()
    {
        totalNumberVillainsCaught++;
    }
    public int villainsCaught()
    {
       return totalNumberVillainsCaught;
    }
    public String toString()
    {
        String t="I am "+ superheroname+", my superpower is "+superpower+
        ", and my catchphrase is "+
        catchphrase+"\nMy real name is "+ getName()+", my favorite food is "+
        getFavoriteFood()+"\n";
        return t;
    }
    public boolean equals(SuperHero inputPerson)
    {
        if(superheroname.equals(inputPerson.getSuperHeroName())&& 
        superpower.equals(inputPerson.getSuperPower())&&
        catchphrase.equals(inputPerson.getFavoriteFood()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
