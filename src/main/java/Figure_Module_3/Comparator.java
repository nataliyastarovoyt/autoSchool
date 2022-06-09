package Figure_Module_3;

import java.util.Comparator;

class FigureComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;

        while (f1 != null && f2 != null) {
            if (f1.getArea() < f2.getArea())
                return -1;
            else if (f1.getArea() == f2.getArea())
                return 0;
            else if (f1.getArea() > f2.getArea())
                return 1;
        }

        return 0;
    }
}

