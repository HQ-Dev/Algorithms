package nod_51;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.Arrays;

public class EE{
static{
   int x=5;
}
static int x,y;
public static void main(String args[]){
   x--;
   myMethod( );
   System.out.println(x+y+ ++x);
}
public static void myMethod( ){
  y=x++ + ++x;
 }
}
