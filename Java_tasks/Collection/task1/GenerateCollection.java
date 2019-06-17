package task1;

import java.util.*;

public class GenerateCollection {
    private int size;
    private int min;
    private int max;
    private List<Integer> list;
    private Set<Integer> set;


    public GenerateCollection(int size, int min, int max) {
        this.size = size;
        this.min = min;
        this.max = max;
        this.list = new ArrayList<>();
        this.set = new HashSet<>();
        initCollection();
    }

    @Override
    public String toString() {
        return "list = " + list +
                ", set = " + set +
                '}';
    }

    private void initCollection(){
        int setSize = max - min + 1;
        while(list.size() < size){
            int element = (int) (Math.random()*setSize) + min;
            list.add(element);
        }

        if (setSize < size) {
            while (set.size() < setSize) {
                int element = (int) (Math.random()*setSize) + min;
                set.add(element);
            }
        } else  while (set.size() < size) {
            int element = (int) (Math.random()*setSize) + min;
            set.add(element);
        }
    }
}
