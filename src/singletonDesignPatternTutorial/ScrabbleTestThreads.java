/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonDesignPatternTutorial;

/**
 *
 * @author rtafuni
 */
public class ScrabbleTestThreads{
	
	public static void main(String[] args){
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
				
		Runnable getTiles = new GetTheTiles();
				
		Runnable getTilesAgain = new GetTheTiles();
				
		// Call for the code in the method run to execute
				
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		
	}
	
}
