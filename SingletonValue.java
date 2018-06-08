package Iterators;

class SingletonValue
{
  static SingletonValue object = new SingletonValue();
   public int x=20;
  private SingletonValue()
  {
	  
  }
  public static  SingletonValue getInstance()
 {
	 
	 return object;
 }
}
