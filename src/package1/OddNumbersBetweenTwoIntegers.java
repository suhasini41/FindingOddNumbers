package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddNumbersBetweenTwoIntegers {

	private int findOddNumbers(int n1, int n2) {
		List<Integer> list = new ArrayList<>();
		for(int i=n1;i<=n2;i++)
		{
			if(i%2!=0)
			{
				list.add(i);
			}
		}
		System.out.println(list.toString());
		int count = list.size();
		return count;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findOddNumbers(1, 7), 4);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findOddNumbers(1, 6), 3);
	}

	@Test
	public void testCase3()
	{
		Assert.assertEquals(findOddNumbers(5, 10), 3);
	}


}
