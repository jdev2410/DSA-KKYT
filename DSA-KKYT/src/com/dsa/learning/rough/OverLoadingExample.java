package com.dsa.learning.rough;

import java.sql.SQLException;
import java.util.function.IntToDoubleFunction;

public class OverLoadingExample {
    public static void main(String[] args) {
        BC b = new BC(12, 21);

    }
}
class AB
{
    public AB(int i)
    {
        System.out.println(myMethod(i));
    }

    int myMethod(int i)
    {
        return ++i + --i;
    }
}

class BC extends AB
{
    public BC(int i, int j)
    {
        super(i*j);

        System.out.println(myMethod(i, j));
    }

    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}

class ABB
{
    void myMethod() throws SQLException
    {
        System.out.println("Super Class");
    }
}

class BAA extends ABB
{
    @Override
    void myMethod() throws SQLException{
        System.out.println("Sub Class");
    }
}
// If child class throws Exception then parent class also throws same exception or its parent exp
// If parent class throws Exception then it not mandatory to throw exp by child overriding method.