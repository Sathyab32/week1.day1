package WEEK1.day2.ASSIGNMENTS;

public class FindIntersection {

	public static void main(String[] args) {

		int[] a = {3,2,11,4,6,7,9,13,87};
		
		int[] b = {1,2,8,4,9,87,13};
		
		int Intersection = 0;
		
		System.out.println("Intersection values are :");
		
		for (int i = 0; i < a.length; i++) 
		{
		
			for (int j = 0; j < b.length; j++) 
			{
			
				if(a[i] == b[j])
				{
					Intersection = a[i];
					
					System.out.println(Intersection);
				}
			}
			
		}
		
	
		
		
	}

}