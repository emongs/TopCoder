package topcoder;

public class NumberMagicEasy {

	public int theNumber(String answer)
	{
		int[] c1 = {0,1,2,3,4,5,6,7};
		int[] c2 = {0,1,2,3,8,9,10,11};
		int[] c3 = {0,1,4,5,8,9,12,13};
		int[] c4 = {0,2,4,6,8,10,12,14};
		int max = 0;
		int result = 0;
		
		int[] check = new int[15];
		
		// Y = 89, N = 78
		if( answer.codePointAt(0) == 89 )
		{
			for(int i = 0 ; i < 8 ; i++)
				check[c1[i]]++;	
		} else
			for(int i = 0 ; i < 8 ; i++)
				check[c1[i]]--;	
		
		if( answer.codePointAt(1) == 89 )
		{
			for(int i = 0 ; i < 8 ; i++)
				check[c2[i]]++;	
		} else
			for(int i = 0 ; i < 8; i++)
				check[c2[i]]--;	
		
		if( answer.codePointAt(2) == 89 )
		{
			for(int i = 0 ; i < 8 ; i++)
				check[c3[i]]++;	
		} else
			for(int i = 0 ; i < 8 ; i++)
				check[c3[i]]--;	
		
		if( answer.codePointAt(3) == 89 )
		{
			for(int i = 0 ; i < 8 ; i++)
				check[c4[i]]++;	
		} else
			for(int i = 0 ; i < 8 ; i++)
				check[c4[i]]--;	
		
		for(int i = 0 ; i < check.length-1 ; i++)
			{
				if ( check[i] > max)
					{
						max = check[i];
						result = ++i;
					}
		
				if ( check[i] == -4)
					result = 16;
			}
		
		System.out.println("정답은 바로!! -> " + result);
		System.out.println("-----------------------------------");
		return result;
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		NumberMagicEasy nme = new NumberMagicEasy();
		
		nme.theNumber("YNYY");
		nme.theNumber("YNNN");
		nme.theNumber("NNNN");
		nme.theNumber("YYYY");
		nme.theNumber("NYNY");
		
	}
	
}
