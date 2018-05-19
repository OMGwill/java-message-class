
/**
 * This code models an email message
 * 
 * @author Will Luttmann 
 * 
 */
public class Message
{
    // instance variables 
    private String sender;
    private String recipient;
    private String messagetext;

    
    public Message() //default constructor
    {
        // initialise instance variables
        sender = "";
        recipient = "";
        messagetext = "";
    }
    
    
    public Message(String s, String r, String mt) //constructor with inputs
    { 
        sender = s;
        recipient = r;
        messagetext = mt;
    }
    
    public Message(Message other) //copy constructor
    { 
        sender = other.sender;
        recipient = other.recipient;
        messagetext = other.messagetext;
    }
    
    
    
    //getter || accessor methods
    public String getSender()
    {
        return sender;
    }
    
    
    public String getRecipient()
    {
        return recipient;
    }
    
    
    public String getMessagetext()
    {
        return messagetext;
    }
    
    
    
    //setter || mutator methods
    public void setSender(String s)
    {
        sender = s;
    }
    
    public void setRecipient(String s)
    {
        recipient = s;
    }
    
    public void setMessagetext(String s)
    {
        messagetext = s;
    }
    
    //appends a line of text to the message body
    public void append(String line)
    {
        messagetext = messagetext + "\n" + line;
    }
    
    //toString print method
    public String toString()
    {
        return "From: " + sender + "\nTo: " + recipient + "\n" + messagetext;
    }
    
    
    
}
