/*Напиши метод public int[] findMinMaxPrices(int[] prices). Он принимает массив цен, и возвращает новый массив, который:
пустой, если переданный массив prices - пустой
из одного элемента, если в массиве prices максимальная и минимальная цена одинаковы
из двух элементов, если в массиве prices есть и минимальная, и максимальная цены. Вначале должна идти минимальная цена, потом максимальная.
Примеры тестов
вызов findMaxPrices(new float[] {10, 50, 3, 1550}) возвращает [3, 1550]
 */

public class exercise30 {
    public int[] findMinMaxPrices(int[] prices) {
        int max = prices[0];
        int min = prices[0];

        if (prices.length == 0) {
            return new int[0];
        } else {
            for (int i = 0; i < prices.length; i++) {
                max = Math.max(max, prices[i]);
                min = Math.min(min, prices[i]);
            }

            if (max == min) {
                return new int[]{min};
            } else {
                return new int[]{min, max};
            }

        }
    }
}
