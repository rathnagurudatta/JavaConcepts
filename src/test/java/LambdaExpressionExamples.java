import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class LambdaExpressionExamples {

	public static void main(String[] args) {
		Bird obj1 = new Eagle();
		obj1.canFly("eagle");
		
		//Anonymous class implementing interface
		Bird obj2 = new Bird() {
			public void canFly(String val) {
				System.out.println("Eagle bird implementation-2");
			}
		};
		obj2.canFly("eagle2");
		
		//Lambda expression implementing interface
		Bird obj3 = (String value) -> System.out.println("Eagle bird implementation-3");
		obj3.canFly("eagle3");
		
		Consumer<Integer> obj4 = (Integer value1) -> {
			if(value1 > 10) {
				System.out.println(value1);
			}
		};
		obj4.accept(11);
		
		//Types of Functional Interface
		Supplier<String> obj5 = () -> "hello";
		System.out.println(obj5.get());
		
		Function<String, String> obj6 = (value) -> "Hello " + value;
		System.out.println(obj6.apply("Rathna"));
		
		Predicate<Integer> obj7 = (value) -> (value>5);
		System.out.println(obj7.test(9));
		
		Predicate<Integer> isEven = (value) -> (value%2 == 0);
		System.out.println(isEven.test(8));
	}

}

@FunctionalInterface
interface Bird{
	void canFly(String val);
}


//Class implements interface
class Eagle implements Bird{

	public void canFly(String val) {
		System.out.println("Eagle bird implementation-1");
	}	
}
