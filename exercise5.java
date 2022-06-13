
public class exercise5 {
    private String name;
    private String serialNumber;


    public void printInfo() {
        System.out.println("Name is " + getName() + ", serial number is " + getSerialNumber());

        //Альтернатива
        //System.out.printf("Name is %s, serial number is %s", getName(), getSerialNumber());


        // public String printInfo(String name,String serialNumber) {
        //    System.out.println("Name is" + name + "serial number is" + serialNumber);
        //}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    //Test output
    public static void main(String[] args) {

    }
}