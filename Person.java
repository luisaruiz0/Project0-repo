//Luis Ruiz
//CS1400
//Assignment 5
//November 15, 2021


public class Person 
{

private String name;
private int age;
private String favoriteFood;

public Person(String name, int age, String favoriteFood)
{
    
    this.name=name;
    this.age=age;
    this.favoriteFood=favoriteFood;
   
    
}
public void setName(String name)
{
    this.name=name;
}
public String getName()
{
    return name;
}
public void setAge(int age)
{
    this.age=age;
}
public String getAge()
{
    return age;
}
public void setFavoriteFood(String favoriteFood)
{
    this.favoriteFood=favoriteFood;
}
public String getFavoriteFood()
{
    return favoriteFood;
}
public String toString()
{
    String s = "My name is "+ name+", I am "+age+
    " years old, and my favorite type of food is "+
    favoriteFood+"\n";
    return s;
}
public boolean equals(Person inputPerson)
{
    if(name.equals(inputPerson.getName())  && 
    favoriteFood.equals(inputPerson.getFavoriteFood()))
    {
        return true;
    }
    else
    {
        return false;
    }
}
public Person copy()
{
    Person copy= new Person(name,age,favoriteFood);
    return copy;
}
}
