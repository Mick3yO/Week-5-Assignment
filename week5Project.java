package week5Project;
    /// Step 1. Create an interface named Logger.
    interface Logger {
         // Step 2 Add two void methods to the Logger interface, each should take a String as an argument
    void log(String message);
    void error(String message);
 }
        // Step 3a
class AsteriskLogger implements Logger {
    // Step 4 The log method on the AsteriskLogger should print out the String it receives 
	//between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
    public void log(String message) {
        System.out.println("***" + message + "***");
    }
    
    // Step 5 The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
    // with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}

// Step 3b
class SpacedLogger implements Logger {
	
	    // Step 6 6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
    public void log(String message) {
        StringBuilder spacedOut = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedOut.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedOut.toString().trim());
    }
    
    // Step 7 and 8  If the log method received “Hello” as an argument, it should print H e l l o
  // The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
    public void error(String message) {
        StringBuilder spacedOut = new StringBuilder();
        spacedOut.append("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            spacedOut.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedOut.toString().trim());
    }
}
	
	
	

     