public class Main {
    public static void main(String[] args) {

        Car[] autoPark = new Car[2];
        Drivers[] drivers = new Drivers[2];

//        Auto1
        Passenger auto1 = new Passenger();
        auto1.setColor(Color.YELLOW);
        auto1.setYear(2002);
        auto1.setBrand(Brand.AUDI);
        auto1.setStateNumber("4232-a5");
        auto1.setVinCod("656432fdgc");
        auto1.setNumberOfPassengerSeats(4);

//        Auto2
        Truck auto2 = new Truck();
        auto2.setColor(Color.BLACK);
        auto2.setYear(2008);
        auto2.setBrand(Brand.MERSEDES);
        auto2.setStateNumber("4562-a5");
        auto2.setVinCod("6546332cbddt");
        auto2.setLoadCapacity(1820);

//        human1
        Drivers human1 = new Drivers();
        human1.setFio("Артур Конан Дойл");
        human1.setAge(45);
        human1.setDrivingExperience(18);
        human1.setCategoryOfRights(CategoryOfRights.A);
        human1.setHeight(172);

//        human2
        Drivers human2 = new Drivers();
        human2.setFio("Усунина Фаина Попаева");
        human2.setAge(28);
        human2.setDrivingExperience(8);
        human2.setCategoryOfRights(CategoryOfRights.C);
        human2.setHeight(156);

        autoPark[0] = auto1;
        autoPark[1] = auto2;

        drivers[0] = human1;
        drivers[1] = human2;

    }
}
