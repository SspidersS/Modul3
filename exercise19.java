
/*Напиши метод public int roundSpeed(int speed).
Он принимает на вход скорость (всегда двузначное число, от 10 до 89 включительно).
И возвращает это же число, округленное по правилам математического округления.
 */


public class exercise19 {
    public int roundSpeed(int speed) {    //73
        int a = speed / 10;         //7
        int b = speed % 10;         //3
        if (b >= 5) {
            a++;
            //a = a + 1;
            // a+=1;
            // Эти три варианта идентичны, делают одно и тоже. Берут наше число a и присваивают ему значение увеличенное на 1
            //Ты можешь выбрать любой вариант, который тебе больше нравится
        }
        return a * 10;
    }
}