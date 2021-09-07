//Author: God Bennett
import java.util.ArrayList;

public class Structure extends ArrayList <Integer>
{
    //feature
    private String description;
    
    //eg 2x2x1, 2 input layers, 2 hidden, 1 output layer
    public Structure ( String description )
    {
        this.description = description;
        
        String [ ] descriptionParts = description.split ( "x" );
        
        for ( int dI = 0; dI < descriptionParts.length; dI ++ )
            add ( Integer.parseInt ( descriptionParts [ dI ] ) );
    }
}
