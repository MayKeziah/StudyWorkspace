/**
 * 
 */
package main;

import static spark.Spark.*;

/**
 * @author E
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello World");
	}

}
