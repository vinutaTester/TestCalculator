package org;

public class Calculator_class {

    int a;
    int b;
    int sum;
    int sub;
    int mul;

    public  Calculator_class(int a, int b){

        this.a=a;
        this.b=b;

        /*sum(a,b);
        sub(a,b);
        mul(a,b);*/
    }

   public float mul() {
        return(a*b);
    }

    private void sub(int a, int b) {
    }

    public int add() {

        return(a+b);
    }
}
