package TM;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Fact {
public static void main(String[] args) {
	Scanner nums = new Scanner(System.in);
	System.out.println("enter number");
	int num=nums.nextInt();
			
	
int count=1;
	for (int i= 1; i <=num; i++)
	{
	count=count*i;
	System.out.println(i);
	}
	{
		System.out.println(count);
	}
}
}
