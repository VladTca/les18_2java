


public class Main {
    private static final String NUMBER1="zdsfg";
    private static final String NUMBER2="dfgkjb53";



    public static void main(String[] args) {
AutoPark autoPark= new AutoPark(5);
autoPark.addCar(new Car("dfgkjb43","Toyota","black",2018));
autoPark.addCar(new Car("dfgkjb53","Mazda","red",2019));
autoPark.addCar(new Car("dfgkjb63","Mercedes","silver",2020));

        System.out.println(autoPark);
        System.out.println("-----------------");
        System.out.println();
        autoPark.seekLicense(NUMBER1);
        System.out.println("-----------------");
        autoPark.seekLicense(NUMBER2);
    }
}