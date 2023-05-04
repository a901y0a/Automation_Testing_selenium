package com.Day7;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex2 {
	int a,b,c;
	//@BeforeSuite
	@BeforeTest
	void getdata()
	{
	System.out.println("Enter the values to calculate:");
	Scanner ob=new Scanner(System.in);
	a=ob.nextInt();
	b=ob.nextInt();
//		a=7;
//		b=4;
	}
  @Test(priority=4)
  
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c,11);
  }
  @Test(priority=3)

  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c,3);
  }
  @Test(priority=1)

  public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 28);
  }
  @Test(priority=2)

  public void divide() {
	  c=a/b;
	  Assert.assertEquals(c, 1);
  }
}