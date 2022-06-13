/*
Напиши метод public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks).
Он принимает два массива товаров, каждый товар - строка.
Возвращается массив, который состоит вначале из товаров в массиве showcaseStocks,
а потом из товаров в массиве warehouseStocks. Порядок товаров не изменяй.
Примеры тестов
вызов mergeStocks(new String[] {"gun", "bow"}, new String[] {"firegun"}) возвращает ["gun", "bow", "firegun"]
 */

import java.util.Arrays;

public class exercise {
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        String[] name = new String[showcaseStocks.length + warehouseStocks.length];
        int n = 0; //

        for (int i = 0; i < showcaseStocks.length; i++) {
            name[n] = showcaseStocks[i];
            n++;
        }

        for (int m = 0; m < warehouseStocks.length; m++) {
            name[n] = warehouseStocks[m];
            n++;
        }
        return name;
    }


    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                validPriceCount++ ;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {
        exercise shop = new exercise();

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[]{"gun", "firebow"};
        String[] warehouseStocks = new String[]{"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}
