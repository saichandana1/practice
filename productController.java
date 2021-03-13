class ProductC{
String id = "p10";
String descrption = "abc";
double price = 100.0;
int discountPercentage = 10;
double discountPrice = 90.0;
}
public class productController{
public static void main(String args[]){
ProductC p1 = new ProductC();
System.out.println(p1.id);
System.out.println(p1.descrption);
System.out.println(p1.price);
System.out.println(p1.discountPercentage);
System.out.println(p1.discountPrice);
ProductC p2 = new ProductC();
System.out.println(p2.id);
System.out.println(p2.descrption);
System.out.println(p2.price);
System.out.println(p2.discountPercentage);
System.out.println(p2.discountPrice);
}
}