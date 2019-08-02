package org.etclite.maventest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class etclite_maventest {
  @Test
  public void sum() {
	  System.out.println("Sum Test");
	  int a = 20;
	  int b = 20;
	  Assert.assertEquals(40, a+b);
	  }
  @Test
  public void sub() {
	  System.out.println("sub Test");
	  int a = 10;
	  int b = 20;
	  Assert.assertEquals(10, b-a);
	  }
  @Test
  public void div() {
	  System.out.println("Div Test");
	  int a = 10;
	  int b = 20;
	  Assert.assertEquals(2, b/a);
	  }
  @Test
  public void mul() {
	  System.out.println("Mul Test");
	  int a = 10;
	  int b = 20;
	  Assert.assertEquals(200, a*b);
	  }
}
