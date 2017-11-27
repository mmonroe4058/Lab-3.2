/*
 * Miriam Monroe and Ramisha Sarwar
 * Lab 3.2
 */
import java.util.Arrays;
public class ArrayMethods2
{
	public static void main (String[] args)
	{
		String [] stuff = {"D","B", "A","C", "E", "G", "Z", "A", "Y"};
		String [] stuff1 = {"A", "C", "E", "G"};
		String [] stuff2 = {"B", "D", "F", "H"};
		
		printArr(merge(stuff1, stuff2));
		System.out.println();
		printArr(mergeSort(stuff));
	}
	public static String[] merge(String[] list1, String[] list2)
	{
		
		String[] merged = new String[list1.length + list2.length];
		int index = 0;
		int i = 0;
		int j = 0;
	
		while(i < list1.length && j<list2.length)
		{
			//System.out.println(i + " " + j);
				if(list1[i].compareTo(list2[j]) <= 0)
				{
					merged[index] = list1[i];
					index++;
					i++;
				}
				else if(list1[i].compareTo(list2[j]) > 0)
				{
					merged[index] = list2[j];
					index++;
					j++;
				}

		}
		
		
		if(i < list1.length)
		{
			
			while(i < list1.length)
			{
				merged[index] = list1[i];
				index++;
				i++;
			}
		}
		
		if(j < list2.length)
		{
			while(j < list2.length)
			{
				merged[index] = list2[j];
				index++;
				j++;
			}
		}
		
		
				
				
		return merged;
	}
	
	public static String[] mergeSort(String[] list)
	{
		int index = list.length/2;
		if(list.length == 1)
		{
			return list;
		}
		else
		{
			//System.out.print(index + " ");
			return merge(mergeSort(Arrays.copyOfRange(list, 0, index)), mergeSort(Arrays.copyOfRange(list, index, list.length)));
		}
	}
	
	public static int partition(int[] list)
	{
		int pivot = list[0];
		int front = 0;
		int back = list[list.length-1];
		int pPivot = 0;
		
		for(int i = back; i< list.length;i--)
		{
			if(list[i] < pivot)
			{
				
			}
		}
		return pPivot;
	}
	
	public static void printArr(String[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
 
}
