package week5Project;

  // Step 9 Create a class named App that has a main method.
public class App {
	

    public static void main(String[] args) {
          Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        
                
        // Step 11 Test both methods on both instances, passing in Strings of your choice.
        asteriskLogger.log("Hello, world!");
        asteriskLogger.error("Something went wrong.");
        spacedLogger.log("Hello, world!");
        spacedLogger.error("Something went wrong.");
        
        
        
        
    }  
    }
    