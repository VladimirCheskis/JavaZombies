package actions.tests;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.BeforeClass;
import org.junit.Test;


import actions.RunAction;
import entities.Entity;

public class Test0008_RunActionTestLine {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@Test
	public void test() {
		Entity entity = new Entity("zomb",5,5);
		Point point = new Point(5,10);
		float k = 5;
		RunAction action = new RunAction(entity, point , k);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(5,(int)entity.getPoint().getY());
		action.step(1);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(6,(int)entity.getPoint().getY());
		action.step(1);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(7,(int)entity.getPoint().getY());
		action.step(2);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(9,(int)entity.getPoint().getY());
		action.step(1);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(10,(int)entity.getPoint().getY());
		action.step(1);
		assertEquals(5,(int)entity.getPoint().getX());
		assertEquals(10,(int)entity.getPoint().getY());
	}

}
