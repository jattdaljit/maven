import junit.framework.Assert;
import org.junit.Test;

public class HelloTest
{
	@Test
	public void testTrue()
	{
		Assert.assertEquals("Hello","Hello");
		System.out.println("Nice job");
	}
}