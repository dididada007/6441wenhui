package test;

import model.Editor;

import org.junit.*;

import static org.junit.Assert.*;


public class MapReaderTest {

	private Editor editor;

	@Before
	public void startIp() {
		editor = new Editor();
	}

	@Test
	public void testMapReader() {
		boolean result = editor.mapparser("F:\\SOEN6441-master_new\\6441\\src\\test\\",
				"world.map");
		assertTrue(result);
	}

}
