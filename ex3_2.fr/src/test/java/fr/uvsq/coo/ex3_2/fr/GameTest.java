package fr.uvsq.coo.ex3_2.fr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	 private Game g;
	 @Before
	 public void setUp() throws Exception {
	 g = new Game();
	 }
	 
	 private void rollMany(int n, int pins) {
	 for (int i = 0; i < n; i++)
	 g.roll(pins);
	 }
	 @Test
	 public void testGutterGame() throws Exception {
		 rollMany(20, 0);
		 assertEquals(0, g.score());
	 }
	 
	 @Test
	 public void testAllOnes() throws Exception {
	 rollMany(20,1);
	 assertEquals(20, g.score());
	 }
	 
	 @Test
	 public void testOneSpare() throws Exception {
	 rollSpare();
	 g.roll(3);
	 rollMany(17,0);
	 assertEquals(16,g.score());
	 }
	 @Test
	 public void testOneStrike() throws Exception {
	 rollStrike();
	 g.roll(3);
	 g.roll(4);
	 rollMany(16, 0);
	 assertEquals(24, g.score());
	 }
	 @Test
	 public void testPerfectGame() throws Exception {
	 rollMany(12,10);
	 assertEquals(300, g.score());
	 }
	 
	 private void rollStrike() {
	 g.roll(10);
	 }
	 
	 private void rollSpare() {
	 g.roll(5);
	 g.roll(5);
	 }

}
