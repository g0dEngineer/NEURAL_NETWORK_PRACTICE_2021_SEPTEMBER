//Author: God Bennett
import java.util.ArrayList;
import java.util.Scanner;

public class Execute
{
    //features
    static NeuralNetwork neuralNetwork = new NeuralNetwork ( );
    static Scanner userScanner = new Scanner ( System.in );
    
    //constructor
    public static void main ( String [ ] neuralArguments )
    {
        doTraining ( );
        doTesting ( );
    }
    
    
    public static void doTraining ( )
    {
        ArrayList <String> trainingData = getTrainingData ( );
        
        for ( int tdI = 0; tdI < trainingData.size ( ); tdI ++ )
        {
            //break up trainind data line of inputs and targets into inputs for forward propagation aka inputs only (L.H.S of input::value)
            String inputsLine = trainingData.get ( tdI ).split ( "::" ) [ 0 ];
            int inputPartA = Integer.parseInt ( inputsLine.split ( "," ) [ 0 ] );
            int inputPartB = Integer.parseInt ( inputsLine.split ( "," ) [ 1 ] );
            int [ ] inputs = new int [ ] { inputPartA, inputPartB };
            neuralNetwork.doForwardPropagation ( inputs );
            
            
            int target = Integer.parseInt ( trainingData.get ( tdI ).split ( "::" ) [ 1 ] );
            neuralNetwork.doBackwardPropagation ( target );
        }
    }
    
    //main menu
    public static void doTesting ( )
    {
        System.out.println ( "God's Neural Network Practice 9-7-2021" );
        System.out.println ( "1. Get neural network response for input = [0,0]" );
        System.out.println ( "2. Get neural network response for input = [0,1]" );
        System.out.println ( "3. Get neural network response for input = [1,0]" );
        System.out.println ( "4. Get neural network response for input = [1,1]" );
        System.out.println ( "5. Quit neural network!!" );
        System.out.println ( "Please select a response" );
        
        int userInput = userScanner.nextInt ( );
       
        switch ( userInput )
        {
            case 1:
            {
                neuralNetwork.doForwardPropagation ( new int [ ] { 0, 0 } ); //give neural network inputs 0,0
                System.out.println ( "Neural network response for input = [0,0] = " + neuralNetwork.getOutcome ( ) );
                returnToTesting ( );
            };
            break;
            
            case 2:
            {
                neuralNetwork.doForwardPropagation ( new int [ ] { 0, 1 } ); //give neural network inputs 0,1
                System.out.println ( "Neural network response for input = [0,1] = " + neuralNetwork.getOutcome ( ) );
                returnToTesting ( );
            };
            break;
            
            case 3:
            {
                neuralNetwork.doForwardPropagation ( new int [ ] { 1, 0 } ); //give neural network inputs 1,0
                System.out.println ( "Neural network response for input = [1,0] = " + neuralNetwork.getOutcome ( ) );
                returnToTesting ( );
            };
            break;
            
            case 4:
            {
                neuralNetwork.doForwardPropagation ( new int [ ] { 1, 1 } ); //give neural network inputs 1,1
                System.out.println ( "Neural network response for input = [1,1] = " + neuralNetwork.getOutcome ( ) );
                returnToTesting ( );
            };
            break;
            
            
            case 5:
            {
                System.exit ( 0 );
            };
        }
    }
    
    //return to main menu
    public static void returnToTesting ( )
    {
        userScanner.nextLine ( );
        
        userScanner.nextLine ( );
        System.out.println ( "\f" );
        doTesting ( );
    } 
    
    
    //get training data
    public static ArrayList <String> getTrainingData ( )
    {
        ArrayList <String> returnValue = new ArrayList <String> ( );
        
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,0::1" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "0,1::1" );
        returnValue.add ( "0,0::0" );
        returnValue.add ( "1,1::0" );
        returnValue.add ( "1,0::1" );
        
        return returnValue;
    }
}