
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


public final class Calculator {
  // TODO: Fill this class in.
  	private final Map<String, BiFunction<Integer, Integer,Integer>> operators = new HashMap<>();
    	
        public void registerOperator(String operator, BiFunction<Integer, Integer, Integer> operation){
        operators.put(operator, operation);
        }
        
        public int calculate(int a, String operator, int b) {
        BiFunction<Integer, Integer, Integer> operation = operators.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Operator not supported: " + operator);
        }
        return operation.apply(a, b);
    }
       
}
