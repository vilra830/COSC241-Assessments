package week06;

public class Person {

    private static int count = 0;
    private int id;
    private String name = "";
    private int age = -1;
    private boolean children;
    private WordList sports = new WordList();


    public Person(){
        this.id = count;
        count += 1;
        
        
    }
    
  
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setChildren(boolean children){

        this.children = children;
    }

    
    
    public boolean getChildren(){
        return children;
        
    }

    public int getId(){

        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public WordList getSports(){
        return sports;
    }

    public void  addSports(String sport){

        
    
    // Use this in the addSports method
        sports = sports.add(sport);
        
    }

    public String toString(){
    
      return    "Person{id=" + id + ", name=" + name + ", age=" + age +
          ", sports=" + sports + ", children=" + children + "}";
    }
}
