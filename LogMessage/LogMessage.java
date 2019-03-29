public class LogMessage
{
    private String machineID;
    private String description;

    public LogMessage( String message )
    {          
        description=message.substring(message.indexOf(":")+1);
        machineID=message.substring(0,message.indexOf(":"));       
    } // end one-arg constructor

    public boolean containsWord( String keyword )
    {
        String des=" "+description +" ";
        String key = " "+keyword+ " ";
        if(des.contains(key))
        {
            return true;
        }
        if(description.equals(keyword))
        {
            return true;
        }
        

        return false;

    } // end method containsWord
    public String getMachineID()
    {
        return machineID;    
    } // end method getMachineID

    public String getDescription()
    {
        return description;    
    } // end method getDescription
    public String toString()
    {
        return machineID + ":" + description;
    } // end method toString
}
