
/**
 * tests the Message Class
 * 
 * Will Luttmann 
 * 
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class TestMessage
{
    public static void main() throws FileNotFoundException
    {
      Scanner in = new Scanner(new File("messages.dat")); // read input from file
      
      //create 2 message objects
      Message message1 = new Message(in.next(),in.next(),in.nextLine().trim());//ask about space in beginning
      Message message2 = new Message(in.next(),in.next(),in.nextLine().trim());//.trim() removes white space from .nextLine()
      
      //close file
      in.close();
      
      
      //print statements
      System.out.println("*************************************************");
      System.out.println("After creating Message objects:");
      System.out.println("*************************************************");
      System.out.println(message1.toString());
      System.out.println();
      System.out.println(message2.toString());
      System.out.println();
      
      //implement setter methods
      message1.setSender("Current Sender1");
      message2.setSender("Current Sender2");
      
      message1.setRecipient("Current Recipient1");
      message2.setRecipient("Current Recipient2");
      
      message1.setMessagetext("This is my current message1");
      message2.setMessagetext("This is my current message2");
      
      //implement getter methods
      
      System.out.println("*************************************************");
      System.out.println("After using setter and getter methods:");
      System.out.println("*************************************************");
      
      System.out.println("Sender: " + message1.getSender());
      System.out.println("Recipient: " + message1.getRecipient());
      System.out.println("Message text: " + message1.getMessagetext());
      System.out.println();
      System.out.println("Sender: " + message2.getSender());
      System.out.println("Recipient: " + message2.getRecipient());
      System.out.println("Message text: " + message2.getMessagetext());
      System.out.println();
      
      //third Message object based on message1 (copy constructor)
      Message message3 = new Message(message1);
      
      //append message2 to message3
      message3.append(message2.getMessagetext());
      
      //print message 3 with toString
      System.out.println("*************************************************");
      System.out.println("After using copy constructor and append methods:");
      System.out.println("*************************************************");
      System.out.println(message3.toString());
      
      
    }
}
