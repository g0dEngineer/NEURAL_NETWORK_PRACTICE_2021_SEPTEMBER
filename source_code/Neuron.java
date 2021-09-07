//Author: God Bennett

import java.util.Random;
import java.util.ArrayList;

public class Neuron
{
    //features
    private int numberOfWeightsFromNextNeuron;
    private int neuronId;
    private double eta;
    private double alpha;
    private double outcome;
    private double gradient;
    private ArrayList <Synapse> weights = new ArrayList <Synapse> ( );
    
    //define neuron structure
    public Neuron ( double eta, double alpha, int neuronId, int numberOfWeightsFromNextNeuron )
    {
        this.eta = eta;
        this.alpha = alpha;
        this.neuronId = neuronId;
        this.numberOfWeightsFromNextNeuron = numberOfWeightsFromNextNeuron;
        
        gradient = 0.0;
        
        //initialize weights
        for ( int wI = 0; wI < numberOfWeightsFromNextNeuron; wI ++ )
        {
            weights.add ( new Synapse ( ) );
            weights.get ( wI ).setWeight ( new Random ( ).nextDouble ( ) ); //set weight value to random value between 0 and 1
        }
    }
    
    //define methods for accessing neuron structures
    public double getOutcome ( )
    {
        return outcome;
    }
    public double getGradient ( )
    {
        return gradient;
    }
    public ArrayList <Synapse> getWeights ( )
    {
        return weights;
    }
    public double getActivation ( double value )
    {
        return Math.tanh ( value );
    }
    public double getPrimeActivation ( double value )
    {
        return 1 - Math.pow ( Math.tanh ( value ), 2 );
    }
    public double getDistributedWeightSigma ( Layer nextLayer )
    {
        double sigma = 0.0;
        
        for ( int nLI = 0; nLI < nextLayer.size ( ) - 1; nLI ++ )
            sigma += getWeights ( ).get ( nLI ).getWeight ( ) * nextLayer.get ( nLI ).getGradient ( ); //these weights * those gradients
        
        return sigma;
    }
    
    
    //define methods for mutating neuron structures
    public void setGradient ( double value )
    {
        gradient = value;
    }
    public void setOutcome ( double value )
    {
        outcome = value;
    }
    //involved in backward propagation where neuron gradients are mutated
    public void setOutcomeGradient ( int target )
    {
        double delta = target - outcome;
        
        setGradient ( delta * getPrimeActivation ( outcome ) );
    }
    //involved in backward propagation where neuron gradients are mutated
    public void setHiddenGradient ( Layer nextLayer )
    {
        double delta = getDistributedWeightSigma ( nextLayer );
        
        setGradient ( delta * getPrimeActivation ( outcome ) );
    }
    //involved in forward prop where neuron outcomes are mutated
    public void doForwardPropagation ( Layer priorLayer )
    {
        double sigma = 0.0;
        
        for ( int pLI = 0; pLI < priorLayer.size ( ); pLI ++ )
            sigma += priorLayer.get ( pLI ).getWeights ( ).get ( neuronId ).getWeight ( ) * priorLayer.get ( pLI ).getOutcome ( ); //prior weights * prior outcomes
            
        setOutcome ( getActivation ( sigma ) );
    }
    
    public void updateWeights ( Layer priorLayer )
    {
        for ( int pLI = 0; pLI < priorLayer.size ( ); pLI ++ )
        {
            double priorDeltaWeight = priorLayer.get ( pLI ).getWeights ( ).get ( neuronId ).getDeltaWeight ( );
            
            //eta x this gradient x prior neuron outcome + momentum_alpha x prior delta weight
            double newDeltaWeight = ( eta * getGradient ( ) * priorLayer.get ( pLI ).getOutcome ( ) ) + ( alpha * priorDeltaWeight );
            
            //update weights and delta weights
            priorLayer.get ( pLI ).getWeights ( ).get ( neuronId ).setDeltaWeight ( newDeltaWeight );
            priorLayer.get ( pLI ).getWeights ( ).get ( neuronId ).setWeight ( priorLayer.get ( pLI ).getWeights ( ).get ( neuronId ).getWeight ( ) + newDeltaWeight );
        }
    }
}
