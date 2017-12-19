package ru.job4j.max;

/**2
 *Class Calculate решение задачи части 4 урок 3.2.
 *@autor vtrushin
 *@since 17.12.2017
 */


public class Max {

    public int max(int first, int second) {
        /* Реализация с пакетной функцией
        return (Math.max(first, second));
        */
        //Говноспособ)
        /*
        int m;
        if (first > second) {
            m = first;
        } else  {
            m = second;
        }
        */
        //Через тернарный оператор
        int m;
        m = first > second ? first : second;
    return m;
    }
}