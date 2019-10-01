package by.spartakzatawit.box;

import by.spartakzatawit.detail.Detail;
import java.util.*;

/**
 * Класс для хранения деталей
 * @author Стас Мохов
 */
public class Box {
    /** Поле для хранения деталей(box) */
    private List<Detail> box;

    /** Конструктор создает новый объект*/
    public Box(){
        box = new ArrayList<>();
    }

    /** Метод добавления детали в box
     * @param detail объект, который будем добавлять
     * @return true, если объект добавлен
     */
    public boolean addDetail(Detail detail){
        return box.add(detail);
    }

    /** Метод просмотра детали по номеру
     * @param index - номер позиции в box
     * @return - возвращает деталь
     */
    public Detail getDetail(int index) {
        return box.get(index);
    }

    /** Метод извлечения детали по номеру
     * @param index - номер позиции в box
     * @return - возвращает извлеченную деталь из box
     */
    public Detail removeDetail(int index){
        return box.remove(index);
    }

    /** Метод замены детали по номеру
     * @param index - номер позиции в box
     * @param detail - объект, который хотим поместить в box
     * @return - возвращает объект, который был заменен в box
     */
    public Detail setDetail(int index, Detail detail){
        return box.set(index, detail);
    }

    /** Метод сортировки деталей*/
    public void sort(){
        //Создание объекта класса, сортировщика
        Comparator compare = new ComparatorByJonson();
        box.sort(compare);
        box.sort(new ComparatorByJonson(){
            //Переопределение метода compare класса ComparatorByJonson
            //анонимном классе, для сортировка деталей по полю time2Machine
            @Override
            public int compare(Detail o1, Detail o2) {
                if (o1.getTime2Machine() <= o1.getTime1Machine() &&
                        o2.getTime2Machine() <= o2.getTime1Machine()){
                    if (o1.getTime2Machine() == o2.getTime2Machine()){
                        return o1.getTime1Machine() - o2.getTime1Machine();
                    }
                    return o2.getTime2Machine() - o1.getTime2Machine();
                }
                return 0;
            }
        });
    }
    /** Метод подсчета времени обработки деталей*/
    public int getTime(){
        int time = 0;
        for (Detail detal: box) {
            time += detal.getTime1Machine();
        }
        time += getDetail((box.size() - 1)).getTime2Machine();
        return time;
    }
    /** Метод представления объекта в ввиде строки
     * @return result возращает строку с информацией о поле box
     */
    @Override
    public String toString()
    {
        String result = "Box:";
        for (int i = 0; i < box.size(); i++)
        {
            result += "\n" + box.get(i).getId() + ")" + getDetail(i);
        }
        return result;
    }

}
