public class Bedroom {
private String name;
Wall wall1;
Wall wall2;
Wall wall3;
Wall wall4;
Ceiling ceiling;
Bed bed;
Lamp lamp;

    public Bedroom(String name) {
        this.name = name;
        wall1 =new Wall("West");
        wall2 =new Wall("East");
        wall3 =new Wall("South");
        wall4 =new Wall("North");
        ceiling =new Ceiling(12,55);
        bed =new Bed("Modern",4,3,2,1);
        lamp =new Lamp("Classic",false,75);
    }
    public Lamp getLamp(){
        return lamp;
    }

    public void ConfigBedroom(){

        bed.make();
        lamp.turnOn();


    }

}

class Wall{
private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

class Ceiling{
  private int height;
  private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}

class Bed{
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("The Bed is being Made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

class Lamp{
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp turned ON");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
