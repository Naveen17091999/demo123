import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Addition{
    void add();
}



public class Main {

    public static void main(String[] args) {
        Addition x = ()->{
            System.out.println("additon.");
        };
        x.add();

        Function<Integer,String> function = (a)->{return "function.";};
        System.out.println(function.apply(12344));
        Predicate<String> predicate = (a)->{return true;};
        predicate.test("Predicate");
        Consumer<String > consumer = (a)->{
            System.out.println(a);
        };
        consumer.accept("Consumer");

        Supplier<String > supplier = ()->{return "Supplier";};
        System.out.println(supplier.get());



    }
}