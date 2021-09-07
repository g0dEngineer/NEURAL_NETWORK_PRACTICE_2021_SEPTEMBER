//Author: God Bennett

public class NeuralNetwork
{
    //features
    private double eta = 0.2;
    private double alpha = 0.5;
    private Structure structure = new Structure ( "2x2x1" );
    private Layers layers = new Layers ( );
    
    //constructor
    public NeuralNetwork ( )
    {
        
        for ( int lsI = 0; lsI < structure.size ( ); lsI ++ )
        {
            layers.add ( new Layer ( ) );
            
            for ( int lI = 0; lI <= structure.get ( lsI ); lI ++ ) //<= implies bias neuron count, i.e. 1 extra neuron per layer
            {
                int numberOfWeightsFromNextNeuron = lsI + 1 < structure.size ( ) ? structure.get ( lsI + 1 ) : 0;
                
                Neuron newNeuron = new Neuron ( eta, alpha, lI, numberOfWeightsFromNextNeuron );
                
                layers.get ( lsI ).add ( newNeuron );
                
                layers.get ( lsI ).get ( layers.get ( lsI ).size ( ) - 1 ).setOutcome ( 1.0 ); //get bias neuron/last neuron per layer and set to 1.0
            }
        }
    }
    
    public void doForwardPropagation ( int [ ] inputs )
    {
        //first feed input values into 1st layer of neural network
        for ( int tI = 0; tI < inputs.length; tI ++ )
            layers.get ( 0 ).get ( tI ).setOutcome ( inputs [ tI ] );
            
        //next do forward propagation from 1st (aka second layer) onwards, based on new 1st layer values
        for ( int lsI = 1; lsI < structure.size ( ); lsI ++ )
        {
            Layer priorLayer = layers.get ( lsI - 1 );
            
            for ( int lI = 0; lI < structure.get ( lsI ); lI ++ )
                layers.get ( lsI ).get ( lI ).doForwardPropagation ( priorLayer );
        }
    }
    
    public void doBackwardPropagation ( int target )
    {
        //calc output gradient
        Neuron outcomeNeuron = layers.get ( layers.size ( ) - 1 ).get ( 0 );
        outcomeNeuron.setOutcomeGradient ( target );
        
        //calc hidden gradient
        for ( int lsI = layers.size ( ) - 2; lsI > 0; lsI -- )
        {
            Layer currentLayer = layers.get ( lsI );
            Layer nextLayer = layers.get ( lsI + 1 );
            
            for ( int lI = 0; lI < currentLayer.size ( ); lI ++ )
                currentLayer.get ( lI ).setHiddenGradient ( nextLayer );
        }
        
        //update weights
        for ( int lsI = layers.size ( ) - 1; lsI > 0; lsI -- )
        {
            Layer currentLayer = layers.get ( lsI );
            Layer priorLayer = layers.get ( lsI - 1 );
            
            for ( int lI = 0; lI < currentLayer.size ( ) - 1; lI ++ )
                currentLayer.get ( lI ).updateWeights ( priorLayer );
        }
    }
    
    public double getOutcome ( )
    {
        return layers.get ( layers.size ( ) - 1 ).get ( 0 ).getOutcome ( );
    }
}
