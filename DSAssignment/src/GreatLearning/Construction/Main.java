package GreatLearning.Construction;

public class Main {

    public static int totalFloors;
    public static int[] totalFloorSize;
    
    public static void main(String[] args) {
        Driver myDriverObj = new Driver();
        myDriverObj.getInput();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
}