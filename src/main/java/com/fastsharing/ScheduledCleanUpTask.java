package com.fastsharing;

/**
 * Scheduled task to clean up the database
 * 
 * @author g2minhle
 * 
 */
public class ScheduledCleanUpTask implements Runnable {

	/**
	 * Clean up old files in database
	 */
	public void run() {
		// Clean up database
		System.out.println("Cleaning up database");
	}

}
