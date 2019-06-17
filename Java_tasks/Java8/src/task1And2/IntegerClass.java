package task1And2;

import java.util.Arrays;

public class IntegerClass {
    private Integer[] arrayOfIntegers;

    public IntegerClass(int size) {
        this.arrayOfIntegers = generateArray(size);
    }

    private Integer[] generateArray(int sizeArray){
        Integer[] array = new Integer[sizeArray];
        for (int i = 0; i < sizeArray; i++){
            array[i] = (int) (Math.random()*100) - 50;
        }
        return array;
    }

    @Override
    public String toString() {
        return  Arrays.toString(arrayOfIntegers);
    }

    public void sortArray(){
        Arrays.sort(arrayOfIntegers, ((one, two) -> (one - two) * -1));
    }

    public Integer[] filteringArrayForPositiveNumbers() {
        return Arrays.stream(arrayOfIntegers).filter(number -> number > 0)
                .toArray(Integer[]::new);
    }
}
