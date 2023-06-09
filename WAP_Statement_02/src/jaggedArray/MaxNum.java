package jaggedArray;

import java.util.ArrayList;
import java.util.List;

public class MaxNum {
	
	public static int findMaxNumber(List<Object> inputList)
	{
		int maxNumber=Integer.MIN_VALUE;
		
		for(Object element : inputList)
		{
			if (element instanceof List)
			{
				int nestedMaxNumber=findMaxNumber((List<Object>) element);
				
				if(nestedMaxNumber > maxNumber)
				{
					maxNumber=nestedMaxNumber;
				}
				else if (element instanceof Integer)
				{
					int number=(Integer) element;
					if(number > maxNumber)
					{
						maxNumber=number;
					}
				}
			}
		}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		List<Object> inputList=new ArrayList<>();
		inputList.add(2);
		inputList.add(4);
		inputList.add(10);
		
		List<Object> nestedList1= new ArrayList<>();
		nestedList1.add(12);
		nestedList1.add(4);
		
		List<Object> nestedList2= new ArrayList<>();
		nestedList2.add(100);
		nestedList2.add(99);
		nestedList1.add(nestedList2);
		
		nestedList1.add(4);
		
		List<Object> nestedList3= new ArrayList<>();
		nestedList3.add(2);
		nestedList3.add(2);
		nestedList3.add(99);
		
		inputList.add(0);
		
		int maxNumber=findMaxNumber(inputList);
		System.out.println("Maximum Number :"+maxNumber);
	}

}
