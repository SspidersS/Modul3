//если номер билетика делится на 10 - вы выиграли кристалл (слово "crystall")
//если номер билетика кончается на цифру 7 - вы выиграли чип (слово "chip")
//если номер билетика больше чем 200 - вы выиграли монету (слово "coin")
//22


public class exercise20 {
    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += " crystall";
        } else if (ticket % 7 == 0) {
            result += " chip";
        } else if (ticket > 200) {
            result += " coin";
        }
        return result.strip();
    }
}
