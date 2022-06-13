public class exercise6 {
    public int getTotalPower() {
        int power = 0;
        if (getBigRocketCount() > 0) {
            power += getBigRocketCount() * 100;
        }
        if (getSmallRocketCount() > 0) {
            power += getSmallRocketCount() * 50;
        }
        return power;
    }

    // getBigRocketCount() * 100 + getSmallRocketCount() * 50;


    public void launchSmallRocket(){
        if(getSmallRocketCount() >0){
            setSmallRocketCount(smallRocketCount -1);
            System.out.println("Launch small rocket");
        }
    }
    public void launchBigRocket() {
        if (getBigRocketCount() > 0) {
            setBigRocketCount(bigRocketCount - 1);
            System.out.println("Launch big rocket");
        }
    }

    private int bigRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if(bigRocketCount <0 || bigRocketCount >100){
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if(smallRocketCount <0 || smallRocketCount >100){
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    private int smallRocketCount;
}
