import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class dataDuctusProjectTest {
	
	@Test
	void empty() throws Exception {
		String s = "[]";
		String p = dataDuctusProject.operation(s);
		assertEquals("",p);
	}

	
	@Test
	void correctInput() throws Exception {
		String s = "[1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E], 3, 4]";
		String p = dataDuctusProject.operation(s);
		assertEquals("1\n" + 
				"2\n" + 
				"  A\n" + 
				"  B\n" + 
				"  C\n" + 
				"    5^&\n" + 
				"    ) () 6\n" + 
				"     \n" + 
				"    7\n" + 
				"  D\n" + 
				"  E\n" + 
				"3\n" + 
				"4",p);
	}
	
	@Test
	void correctInputNoSpace() throws Exception {
		String s = "[1, 2, [A, B, C, [5^&, )()6, , 7], D, E], 3, 4]";
		String p = dataDuctusProject.operation(s);
		assertEquals("1\n" + 
				"2\n" + 
				"  A\n" + 
				"  B\n" + 
				"  C\n" + 
				"    5^&\n" + 
				"    )()6\n" + 
				"     \n" + 
				"    7\n" + 
				"  D\n" + 
				"  E\n" + 
				"3\n" + 
				"4",p);
	}
	
	@Test
	void checkInvalid() throws Exception {
		String s = "1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E], 3, 4]";
		String p = dataDuctusProject.operation(s);
		assertEquals("Invalid!",p);
	}
	
	@Test
	void checkInvalid2() throws Exception {
		String s = "[1, 2, [A, B, C, [5^&, ) () 6, , 7], D, E, 3, 4]";
		String p = dataDuctusProject.operation(s);
		assertEquals("Invalid!",p);
	}
	
	@Test
	void checkInvalid3() throws Exception {
		String s = "[1, 2, [A, B, C, [5, 6]]";
		String p = dataDuctusProject.operation(s);
		assertEquals("Invalid!",p);
	}
	
	@Test
	void checkInvalid4() throws Exception {
		String s = "[1, 2, [A, B, C, [5, 6]]][";
		String p = dataDuctusProject.operation(s);
		assertEquals("Invalid!",p);
	}

}
