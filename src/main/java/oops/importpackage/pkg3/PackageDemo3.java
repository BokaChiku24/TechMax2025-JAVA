package oops.importpackage.pkg3;

public class PackageDemo3 extends oops.importpackage.pkg2.PackageDemo2{
    public void get(){
        System.out.println("This is get method from pkg3.PackageDemo3 class");
    }
    public static void main(String[] args) {
        PackageDemo3 pd = new PackageDemo3();
        pd.get();
        pd.set(); // Output: This is set method from pkg1.PackageDemo class
        pd.callMe(); // Output: This is callMe method from pkg2.PackageDemo2 class
    }
}
