package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.*;

public class TestVehicleQueue {

	@Test
	public void newQueueShouldBeEmpty() {
		VehicleQueue queue = new VehicleQueue();
		assertEquals(0, queue.size());
	}

	@Test
	public void failingTest() {
		assertEquals(0,1);
	}

}
