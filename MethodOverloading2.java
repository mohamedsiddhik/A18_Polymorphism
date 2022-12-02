

//by Changing number of arguments
//by changing the number of arguments

public  class MethodOverloading2
{
    int multiply(int n1 , int n2){  // Two int parameter with same method name
        return  n1 + n2;
    }
    int multiply(int n1 , int n2 , int n3){  // Three Int Parameter with same method name
        return  n1 + n2 +n3;
    }
    float multiply(float f1 , float f2){ // two float parameter with same method name
        return f1 + f2;
    }
    int multiply(int i){
        return  i*i*i;
    }


    public static void main(String[] args) {
        MethodOverloading2 m2 = new MethodOverloading2();
        System.out.println("sum of two numbers : " + m2.multiply(122,33));
        System.out.println("Sum of three numbers : " + m2.multiply(11,11,11));
        System.out.println("Sum of float numbers : " + m2.multiply(11.5f,76.4f));
        System.out.println("Sum of int Cube of : " + m2.multiply(3));

    }
}