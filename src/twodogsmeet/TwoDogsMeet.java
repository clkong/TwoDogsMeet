/*
 *Sean Luo 22/10/2018
 *TwoDogsMeet.java
 *This is progrem calculates the TwoDogsMeet.
 */
package twodogsmeet;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dog1name,dog2name,change1,change2,Hunger1,Hunger2,Aggression1
                ,Aggression2;
        dog1name = JOptionPane.showInputDialog("Please enter the first dog's name:");
        dog2name = JOptionPane.showInputDialog("Please enter the second dog's name:");
        Dog dog1 = new Dog(dog1name, "Spaniel");
        Dog dog2 = new Dog(dog2name, "Border Collie");
        change1 = JOptionPane.showInputDialog("Do you want to change the dog's"
                + " aggression and hunger?\n1.Yes\n2.No");
        if(change1.equalsIgnoreCase("1")){
             change2 = JOptionPane.showInputDialog("Which dog do you want to "
                     + "change?\n1.The first dog\n2.The second dog\n3.Both");
             if(change2.equalsIgnoreCase("1")){
                Hunger1 = JOptionPane.showInputDialog("New hunger for the "
                        + "first dog:");
                int H1 = Integer.parseInt(Hunger1);
                dog1.setHunger(H1);
                Aggression1 = JOptionPane.showInputDialog("New aggression for"
                        + "the first dog:");
                int A1 = Integer.parseInt(Aggression1 );
                dog1.setAggression(A1);
             }
             else if(change2.equalsIgnoreCase("2")){
                 Hunger2 = JOptionPane.showInputDialog("New hunger for the "
                        + "second dog:");
                 int H2 = Integer.parseInt(Hunger2);
                 dog2.setHunger(H2);
                Aggression2 = JOptionPane.showInputDialog("New aggression for"
                        + "the second dog:");
                int A2 = Integer.parseInt(Aggression2);
                dog2.setAggression(A2);
             }
             else if(change2.equalsIgnoreCase("3")){
                 Hunger1 = JOptionPane.showInputDialog("New hunger for the "
                        + "first dog:");
                int H1 = Integer.parseInt(Hunger1);
                dog1.setHunger(H1);
                Aggression1 = JOptionPane.showInputDialog("New aggression for"
                        + "the first dog:");
                int A1 = Integer.parseInt(Aggression1 );
                dog1.setAggression(A1);
                Hunger2 = JOptionPane.showInputDialog("New hunger for the "
                        + "second dog:");
                 int H2 = Integer.parseInt(Hunger2);
                 dog2.setHunger(H2);
                Aggression2 = JOptionPane.showInputDialog("New aggression for"
                        + "the second dog:");
                int A2 = Integer.parseInt(Aggression2);
                dog2.setAggression(A2);
             }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid selection!");
             }   
                     }       
        else if(change1.equalsIgnoreCase("2")){
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid selection!");
        }
    System.out.println(dog1);
    System.out.println("--------------------------");
    System.out.println(dog2);
    System.out.println("--------------------------");
    
    if (dog1.getAggression() > 5) {
      
        if(dog2.getAggression() > 5){
            if(dog1.getHunger() > dog2.getHunger()){
                System.out.println("Dog1 wins.");
                
            }
            else{
                System.out.println("Dog2 wins.");
            }
        }
        else{
            System.out.println("Dog1 wins");
        }
    }
    else{
        if(dog2.getAggression() > 5){
            System.out.println("Dog2 wins");
        }
        else{
            System.out.println("They play happily");
        }
           
    }
}   
}
