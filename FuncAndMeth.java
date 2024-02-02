import java.util.*;

public class FuncAndMeth {
    // Functions written in a class are methods for that class 
    // In Java, functions are termed as methods. They are code blocks within classes, organizing tasks. Methods may return values, take parameters, and enhance code modularity and structure.
    // In JAVA, the terms "function" and "method" are often used interchangeably


    // Function Withput Parameter
    public static void printHelloWorld(){
        System.out.println("Hello Universe");
        System.out.println("Hello Universe");
        System.out.println("Hello Universe");
    }

    // Function with parameter (Parameter = Input)
    /* Parameters are of two types Actulal Parameters or Arguments( Passed during Function call) and Formal Parameters(Passed in Function Definition)   */
    public static int calsum(int num1, int num2){
        int sum = num1+num2;// formal parameters
        return sum;
    }

    //Swap Function 
    public static void Swap(int c, int d){
        int temp = c;
         c= d;
         d=temp;       
    }

    //Product of a and b
    public static int Prod(int a, int b){
        int mul = a*b;
        return mul;
    }

    //Factorial of num n 
    public static int factorial(int n){
        int f = 1;

        for(int i =1; i<=n ; i++){
            f= f*i;
        }
        return f;
    }

    // Binomial Cofficient 
    public static int BinoCoff(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        return a/(b*c);
    }

    //to caculate sum of 2 num for differnt parameters Overloading 
     public static int Sum(int a, int b){
        return a+b;
     }
    //to caculate sum of 3 num for differnt parameters Overloading
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }

    //to caculate sum of 2 int values 
    public static int Sum1(int a, int b){
        return a+b;
    }
    //to calculate sum of 2 float values
    public static float Sum(float a, float b){
        return a+b;
    }

    // Prime or not 
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }

        for (int i = 2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;  
    }

    //Optimized prime or not 
    public static boolean OptiisPrime(int n){
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Prime primes numbers in range
    public static void PrimesinRange(int n){
        for(int i =2; i<=n; i++){
            if(OptiisPrime(i)){
                System.out.println(i+ " ");
            }
        }   
    }

    //Binary num to decimal
    public static void BintoDec(int n){
        int m =n;
        int pow=0;
        int decimal=0;
        
        while(n>0){
            int lastDigit = n% 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println(m + "=" + decimal);
    }

    //Decimal to Binary 
    public static void DectoBin(int n){
        int m =n;
        int pow = 0;
        int bin = 0;

        while(n>0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println(m + "=" + bin);
    }

    // Scope topic 

    /*Passing Parameters:
You can pass the variable as a parameter from one function to another. For example:

java
Copy code
public static void function1() {
    int x = 10;
    function2(x);
}

public static void function2(int y) {
    // Now, 'y' has the value of 'x' from function1
    System.out.println(y);
}
Return Values:
You can make the first function return the value, and the second function can capture that value. For example:

java
Copy code
public static int function1() {
    int x = 10;
    return x;
}

public static void function2() {
    int result = function1();
    System.out.println(result);
}
Instance Variables:
If the functions are part of a class, you can use instance variables. The variable will be a member of the class and can be accessed by any method in that class.

java
Copy code
public class MyClass {
    private int myVariable;

    public void function1() {
        myVariable = 10;
    }

    public void function2() {
        System.out.println(myVariable);
    }
} */

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calsum(a,b);// Actual Parameters 
        System.out.println(sum);

        // Code to Swap two values 
        int c= 3;
        int d=7;
        Swap(a,b);
        System.out.println("a= "+ c);
        System.out.println("b= "+ d);
        
        //code for product 
        int mul = Prod(3,5);
        System.out.println(mul);
        mul = Prod(10,20);
        System.out.println(mul);

        // Factorial code 
        System.out.println(factorial(4));

        //Binomial Cofficient
        System.out.println(BinoCoff(5,2)); 

        //Function Overloading = Same name of functions with different parameters 
        System.out.println(Sum(2,3));
        System.out.println(Sum(2,3,4));      

        //Function Overloading = Same name of functions with different data types
        System.out.println(Sum(1,2));
        System.out.println(Sum(2.3f, 4.5f));

        //Prime or not 
        System.out.println(isPrime(32));

        // Optimized Prime or not 
        System.out.println(OptiisPrime(2));

        // Prime in Range 
        PrimesinRange(10);

        //Binto dec
        BintoDec(101);

        //Decto bin
        DectoBin(7);



        








        
    }
    
}
