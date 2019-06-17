package task1And2;

import java.util.Optional;

@java.lang.FunctionalInterface
public interface ConverterInterface<String> {

    String convertString(String string);

    default boolean stringIsPresent(String string){
        Optional<String> optional = Optional.ofNullable(string);
        return optional.isPresent();
    }
}
