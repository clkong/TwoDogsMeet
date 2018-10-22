/*
 *Sean Luo 22/10/2018
 *TwoDogsMeet.java
 *This is progrem calculates the TwoDogsMeet.
 */
package twodogsmeet;

/**
 *
 * @author toluo7449
 */
public class Dog {
    //variables for characteristics
  private String dogName, dogBreed;
  private int aggression, hunger,age;

  //constructors
  public Dog(String dgName, String dgBreed,int aggression,int hunger,int age ){
     dogName = dgName;
     dogBreed = dgBreed;
     age = (int)(Math.random()*10) + 1;
     aggression = (int)(Math.random()*10) + 1;
     hunger = (int)(Math.random()*10) + 1;
  }

  //Alternate constructor
  public Dog(String dgName1, String dgBreed1){
    //This constructor only uses the name and breed
    //Set the aggression and hunger to random #s

    dogName = dgName1;
    dogBreed = dgBreed1;
    age = (int)(Math.random()*10) + 1;
    aggression = (int)(Math.random()*10) + 1;
    hunger = (int)(Math.random()*10) + 1;
  }

  //Accessor Methods
   public String getName() {
    return dogName;
  }

  public void setName(String dgName){
    dogName = dgName;
  }

  public String getBreed() {
    return dogBreed;
  }

  public void setBreed(String dgBreed){
    dogBreed = dgBreed;
  }
  
   public int getAggression() {
    return aggression;
  }

  public void setAggression(int dogAgg){
    aggression = dogAgg;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int dogHung){
    hunger = dogHung;
  } 
  public void barkFriendly() {
    System.out.println("Arf! Arf!");
  }

  public void barkAngry() {
    System.out.println("GRR! RRRFFF!");
  }

  //method to display all info of the Dog
  public String toString() {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
  }
}


