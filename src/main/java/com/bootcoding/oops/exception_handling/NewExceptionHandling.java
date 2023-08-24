package com.bootcoding.oops.exception_handling;

public class NewExceptionHandling extends Exception implements Cloneable{
         String newException;
         public  NewExceptionHandling(String name){
             this.newException=name;
         }
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

    public static void main(String[] args) throws Exception{
            NewExceptionHandling exceptionHandling=new NewExceptionHandling("CloneNotSupportedException Created");
        try{
            //this is just pointing to the previous Reference variable  stuff and Not Creating the new for it //
          NewExceptionHandling exception=(NewExceptionHandling)exceptionHandling.clone();
            System.out.println(exception.newException);

        }
        catch (Exception e){

            System.out.println(e.getMessage());
        }
        finally {

            System.out.println("Executed finally");

        }
    }

}
