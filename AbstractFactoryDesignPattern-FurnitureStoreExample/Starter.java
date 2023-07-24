import java.util.ArrayList;
import java.util.List;

//FIRST HANDS ON VERSION
@FunctionalInterface
interface Bank{
    void amountAfterInterest(double amount);
}
class PNB implements Bank{
    @Override
    public void amountAfterInterest(double amount) {
        System.out.println(amount + amount*0.07);
    }
}
class PNB2{
    Bank bank = (double amount) ->{
        System.out.println(amount + amount*0.07);
    };
}

//SECOND HANDS ON VERSION
@FunctionalInterface
interface Raise{
    double calculate(int salary);
}
class annualRaise implements Raise{
    public double calculate(int salary)
    {
        return salary*0.09;
    }
}
class annualRaise1{
    Raise raise = (int salary)->{
      return salary*0.09;
    };
}

//THIRD HANDS ON VERSION
@FunctionalInterface
interface Shape{
    double area(double x);
}
class Circle implements Shape{
    public double area(double x){
        System.out.println("Drawing circle 1");
        return x*x*3.14;
    }
}
class Circle2 {
    Shape shape = (double x)->{
        System.out.println("Drawing circle 2");
        return x*x*3.14;
    };
}

//FOURTH HANDS ON VERSION
@FunctionalInterface
interface Transaction{
    double toDollar(double amount);
}
class Pound implements Transaction{
    public double toDollar (double amount){
        return amount*0.055;
    }
}
class Pound1 {
    Transaction trans = (double amount)->{
        return amount*0.055;
    };
}


public class Starter {
    public static void main(String[] args) {


    }
}
