public class salestax
{
public static void main(String[] args)
{
double regularPrice = 6.0;
double statetax;
double citytax;
double salestax;
double salePrice;

statetax =  regularPrice * 0.02;

citytax = regularPrice * 0.04;

salestax = citytax + statetax;

salePrice = regularPrice + salestax;


System.out.println("Regular price $" + regularPrice);
System.out.println ("statetax:$"+ citytax);
System.out.println ("citytax:$"+ statetax);
System.out.println("Sales tax$" + salestax);


System.out.println("Sale price $" + salePrice);

}
}

