/**
 * 
 */
package com.jane.junitdemo.artifact;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author jane
 *
 */
public class MathTest {
	/**
	 * {@link com.jane.junitdemo.artifact.Math#Add(int, int)} 的測試方法。
	 */
	@Test
	public void testAdd() {
		int expected = 5;
		
		// Arrange
		Math m = new Math();

		// Act
		int actual = m.Add(2, 3);

		// Assert
		assertEquals(expected, actual);
	}

}
