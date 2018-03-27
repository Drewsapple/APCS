public class CarV7NewTester{
    public static void main(String[] args){
        //Car Setup
        CarV7 carSetup = new CarV7("",0,0,0,0);
        carSetup.printHeader();
        //Car 1
        String carType1 = "Honda Odyssey";
        int startMiles1 = 54938;
        int endMiles1 = 55245;
        double gallonsUsed1 = 15.9;
        double pricePerGallon1 = 2.17;
        
        CarV7New car1 = new CarV7(carType1, endMiles1, startMiles1, gallonsUsed1, pricePerGallon1);
        
        car1.calcDistance();
        car1.totalCost();
        car1.calcMPG();
        car1.calcGPM();
        car1.printData();
        
        //Car 2
        String carType2 = "10 Hummer H3";
        int startMiles2 = 10501;
        int endMiles2 = 10783;
        double gallonsUsed2 = 21.4;
        double pricePerGallon2 = 2.17;
        
        CarV7New car2 = new CarV7(carType2, endMiles2, startMiles2, gallonsUsed2, pricePerGallon2);
        
        car2.calcDistance();
        car2.totalCost();
        car2.calcMPG();
        car2.calcGPM();
        car2.printData();
        
        //Car 3
        String carType3 = "Toyota Prius";
        int startMiles3 = 16387;
        int endMiles3 = 16729;
        double gallonsUsed3 = 8.2;
        double pricePerGallon3 = 2.17;
        
        CarV7New car3 = new CarV7(carType3, endMiles3, startMiles3, gallonsUsed3, pricePerGallon3);
        
        car3.calcDistance();
        car3.totalCost();
        car3.calcMPG();
        car3.calcGPM();
        car3.printData();
    }
}