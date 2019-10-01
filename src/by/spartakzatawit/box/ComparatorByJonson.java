package by.spartakzatawit.box;

import by.spartakzatawit.detail.Detail;
import java.util.Comparator;

/**
 * Класс для сравнения объектов
 * @author Стас Мохов
 */
public class ComparatorByJonson implements Comparator<Detail> {
    /** Метод сравнения деталей
     * @param o1  - объект класса Detail
     * @param o2  - объект класса Detail
     * @return 0 если у объектов time1Machine равно
     * @return -int если у объекта o1(time1Machine) < o2 (time1Machine)
     * @return +int если у объекта o1(time1Machine) > o2 (time1Machine)
     */
    @Override
    public int compare(Detail o1, Detail o2) {
        if (o1.getTime1Machine() <= o1.getTime2Machine() ||
                o2.getTime1Machine()<= o2.getTime2Machine()){
            return o1.getTime1Machine() - o2.getTime1Machine();
        }
        return 0;
    }


}
