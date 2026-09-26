package com.example.maven_github_demo;

/**
 * Hello world!
 */
public class GradeCalculator {
	
	public static int calculateTotal(int m1, int m2, int m3)
	{
		return m1 + m2 + m3;
	}
	public static double calculateAverage(int m1,int m2 ,int m3)
	{
		return calculateTotal(m1,m2,m3)/3.0;
	}
	public static boolean isPass(double average)
	{
		return average >=30.0;
	}
    public static void main(String[] args) 
    {
    	int m1 =65,m2=64,m3=80;
    	int total= calculateTotal(m1,m2,m3);
    	double average=calculateAverage(m1,m2,m3);
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);
        System.out.println("Result:"+(isPass(average)?"Pass":"Fail"));
    }
}
