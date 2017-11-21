/*
 * Miriam Monroe and Ramisha Sarwar
 * Lab 3.2
 */
import java.util.Arrays;
public class ArrayMethods2
{
	public static void main (String[] args)
	{
		String [] stuff = {"D","B", "A","C", "E", "G"};
		String [] stuff1 = {"A", "C", "E", "G"};
		String [] stuff2 = {"B", "D", "H", "F"};
		
		printArr(merge(stuff1, stuff2));
		System.out.println();
		printArr(mergeSort(stuff));
	}
	public static String[] merge(String[] list1, String[] list2)
	{
		/*
		String[] merged = new String[list1.length + list2.length];
		int index = 0;

		for(int i = 0; i < list1.length && i<list2.length; i++)
		{
				merged[index] = list1[i];
				merged[index+1]= list2[i];
				index += 2;
		}
		*/
		
		String[] merged = new String[list1.length + list2.length];
		int i = 0;
		int j = 0;
		int x = 0;		
		while()
		
		
		
				if(list1.length > list2.length)
				{
					for(int i = list2.length; i <list1.length; i++)
					{
						merged[index] = list1[i];
					}
				}
				else 
				{
					for(int i = list1.length; i < list2.length; i++)
					{
						merged[index] = list2[i];
					}
				}
		return merged;
	}
	
	public static String[] mergeSort(String[] list)
	{
		/*if(list1[i].compareTo(list2[j]) < 0)
		{
			String temp = list2[j];
			list2[j] = list1[i];
			list1[i] = temp;
		}
		else if(list1[i].compareTo(list2[j])> 0)
		{
			
		}*/
		int index = list.length/2;
		if(list.length == 1)
		{
			return list;
		}
		else
		{
			System.out.print(index + " ");
			return merge(mergeSort(Arrays.copyOfRange(list, 0, index)), mergeSort(Arrays.copyOfRange(list, index, list.length)));
			
			//mergeSort(merge());
					//Arrays.copyOfRange()
		}
	}
	public static void printArr(String[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
 
}
