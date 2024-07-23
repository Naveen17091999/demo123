import javax.annotation.processing.FilerException;

public class MyException {
    public static void main(String[] args)throws FilerException {
        System.out.println("Before Exception");

        try{
//            throw new NullPointerException("This is Nullpointer.");
            test();
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("This is finally block.");
        }
        System.out.println("After Exception.");
    }

     static void test()throws FilerException{
        throw new FilerException("this i an excepiton.");
     }
}
