package by.spartakzatawit.detail;

/**
 * Класс для описания деталей
 * @author Стас Мохов
 */
public class Detail {
    /**Поле время обработки детали на 1ом станке*/
    private final int time1Machine;
    /**Поле время обработки детали на 2ом станке*/
    private  final int time2Machine;
    /**Поле номер детали*/
    private final int id;

    /** Конструктор создает новый объект*/
    public Detail(int id, int time1Machine, int time2Machine) {
        this.id = id;
        this.time1Machine = time1Machine;
        this.time2Machine = time2Machine;
    }

    /**Метод получения времени обработки детали на 1ом станке
     * @return время
     */
    public int getTime1Machine() {
        return time1Machine;
    }

    /**Метод получения времени обработки детали на 2ом станке
     * @return время
     */
    public int getTime2Machine() {
        return time2Machine;
    }

    /**Метод получения номера детали
     * @return номер
     */
    public int getId() {
        return id;
    }

    /**Метод представления объекта в ввиде строки
     * @return строку с информацией об детали
     */
    @Override
    public String toString() {
        return  "[" + time1Machine + ";" + time2Machine +"]";
    }
}
