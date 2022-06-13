/*Напиши метод public boolean isHangarOk(int side1, int side2, int price).
Он принимает две стороны ангара (side1 и side2,
причем порядок может быть любой - вначале большая потом меньшая, и наоборот), и цену за аренду всего ангара в сутки.
Тебе нужно понять, подходит ли ангар, по критериям описанным выше.
Если подходит - возврати true, и возврати false в противном случае.
Примеры тестов
вызов isHangarOk(100, 75, 100000) возвращает true
вызов isHangarOk(100, 20, 10000) возвращает false
 */

public class exercise23 {
    public boolean isHangarOk(int side1, int side2, int price) {
        boolean hangar = false;
        if (side1 * side2 >= 1500) {
            return hangar = true;
        }
        if (side1 > side2) {
            if (side1 < 2 * side2) {
                return hangar = true;
            } else if (side2 < 2 * side1) {
                return hangar = true;
            }
        }
        if (price < 1000) {
            return hangar = true;
        }
        return hangar;
    }
}