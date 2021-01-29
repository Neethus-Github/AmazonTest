import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class TestAddtionUnit {

	@Test(timeout=5000,expected=TestTimedOutException.class )
	public void testAdd() throws Exception{
		Thread.sleep(3000);
		AdditionTest a=new AdditionTest();
		int sum=a.additionTest();
		assertEquals(7,sum);
	}
	@Test
	public void testSubstraction() {
		AdditionTest a=new AdditionTest();
		int dif=a.substractionTest();
		assertEquals(2,dif);
	}
	@Ignore("already tested")
	@Test
	public void demo() {
		System.out.println("This is demo");
	}

}
