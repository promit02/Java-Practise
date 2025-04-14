import myotherpackage.Myclass;
import mypackage.Inter1;


public class myDerivedClass extends MyClass
{
public Inter1 getInnerClassObject()
{
return new MyInnerClass();
}
}