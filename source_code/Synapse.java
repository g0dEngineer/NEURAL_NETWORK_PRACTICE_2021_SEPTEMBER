//Author: God Bennett

public class Synapse
{
    //features
    private double weight = 0.0;
    private double deltaWeight = 0.0;
    
    
    
    public double getWeight ( )
    {
        return weight;
    }
    
    public double getDeltaWeight ( )
    {
        return deltaWeight;
    }
    
    
    public void setWeight ( double value )
    {
        weight = value;
    }
    
    public void setDeltaWeight ( double value )
    {
        deltaWeight = value;
    }
}
