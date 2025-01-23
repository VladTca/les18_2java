import java.util.Arrays;

class AutoPark {
    private int capacity;
    private Car[] arrCar;
    private int size;

    public AutoPark(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arrCar = new Car[capacity];
    }


    public void addCar(Car car) {
        if (size < arrCar.length) {
            arrCar[size] = car;
            size++;
        }

    }

    public void seekLicense (String lic){

        for (int i = 0; i < size; i++) {
            if(arrCar[i].getLicensePlate().equals(lic)){
                System.out.println("Номер найден! В автопарке числится под номером-"+i);
                System.out.println(arrCar[i]);
                return;
            }
        }
        System.out.println("Номер не найден!");
    }

    @Override
    public String toString() {
        String result = "AutoPark: capacity=" + capacity + ",\nCars: \n";
        for (int i = 0; i < size; i++) {
            if (arrCar[i] != null) {
                result += arrCar[i]+"\n";

            }
        }
        return result;
    }
}
