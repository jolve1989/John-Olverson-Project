package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface 
public interface Operation {
   //methods by default in an interface are public and abstract
	int operate(int num1, int num2);
}
	

