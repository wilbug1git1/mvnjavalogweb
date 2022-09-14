package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        final static Logger logger = Logger.getLogger(classname.class);
        
        //logs a debug message
	    if(logger.isDebugEnabled()){
	        logger.debug("This is debug");
	    }
	
	    //logs an error message with parameter
	    logger.error("This is error : " + parameter);
	
	    //logs an exception thrown from somewhere
	    logger.error("This is error", exception);

        System.out.println("Hello World!");
    }
}