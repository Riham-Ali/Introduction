
package sortproject;

public class Element {
    private String name;
    private int ID;
    
    Element(String name, int ID){
        this.name=name;
        this.ID=ID;        
    }
    
    public String getName(){return name;}
    public int getID(){return ID;}
    
    public void setName(String name){this.name=name;}
    public void setID(int ID){this.ID=ID;}
    
    public void display(){
        System.out.println("Name: "+name+"\tID: "+ID);
    }
}