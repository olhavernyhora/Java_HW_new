package homework7;

import java.util.Comparator;

public class CompareShapeByColor implements Comparator {
    @Override
    public  int compare(Object o1, Object o2) {
        String obj1 = ((Shape)o1).getColor();
        String obj2 = ((Shape)o2).getColor();
        return obj1.compareTo(obj2);
    }
}
