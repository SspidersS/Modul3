//Напиши класс CaptainDisputeAgain. В этом классе создай метод public int findMin(int[] triple).
//Он принимает массив из трех целых чисел, и возвращает минимальное из них. Оператор if использовать нельзя.

public class exercise26 {
    public int findMin(int[] triple) {
        return triple[0] < triple[1] && triple[0] < triple[2] ?
                triple[0] : triple[1] < triple[0] && triple[1] < triple[2] ? triple[1] : triple[2];

    }
}