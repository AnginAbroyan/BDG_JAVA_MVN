package classes_and_objects.cityclass;

public class City {
    String name;
    long population;
    public City(String name, long population){

    }
    public static void main(){
        City c1 = new City("Yerevan", 1_060_138);
        City c2 = new City("Moscow", 12_641_000);
        City c3 = new City("New York", 19_680_000);
        City c4 = new City("Paris", 2_220_000);
    }
}
