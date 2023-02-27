
class Coords{
    public int x,y;
    public Coords(int valX, int valY){
        x = valX;
        y = valY;
    }
}
class Road{
    enum types{
        highway, express, country
    }
    private String name;
    private types type;
    private int speedLimit, distance;
    private Location start, finish;

    public Road(String iName, types iRoadType, int iSpeedLimit, int iDistance, Location iStart, Location iFinish ){
        name = iName;
        type = iRoadType;
        speedLimit = iSpeedLimit;
        distance = iDistance;
        start = iStart;
        finish = iFinish;
    }

    public String getName(){
        return name;
    }
    public types getType(){
        return type;
    }
    public int getSpeedLimit(){
        return speedLimit;
    }
    public int getDistance(){
        return distance;
    }
    public Location getLoacationStart(){
        return start;
    }
    public Location getLoacationFinish(){
        return finish;
    }

    public void setName( String newName){
        name = newName;
    }
    public void setType(types newType){
        type = newType;
    }
    public void setSpeedLimit(int newSpeedLimit){
        speedLimit = newSpeedLimit;
    }
    public void setDistance(int newdDistance){
        distance = newdDistance;
    }
    public void setLoacationStart(Location newStart){
        start = newStart;
    }
    public void setLoacationFinish(Location newFinish){
        finish = newFinish;
    }
    public String toString() {
        return getName();
    }
}

class Location{
    enum types{
        city, airport, station
    }
    private String name;
    private types type;
    private Coords pos;

    public Location(String iName, types iLocation, Coords iPos){
        name = iName;
        type = iLocation;
        pos = iPos;
    }

    public String getName(){
        return name;
    }
    public types getType(){
        return type;
    }
    public Coords getPos(){
        return pos;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setType(types newLocation){
        type = newLocation;
    }
    public void setPosition(Coords newPosition){
        pos = newPosition;
    }
    public String toString() {
        return getName();
    }
}

class oWorld {
    public static void main(String[] args) {
        Location london = new Location("London", Location.types.city, new Coords(0, 0));
        Location paris = new Location("Paris", Location.types.city, new Coords(5, 100));
        Location chunnel = new Location("chunnel", Location.types.station, new Coords(2, 50));
        Road brit = new Road("road 1", Road.types.express, 80, 1000, london, chunnel);
        Road frnch = new Road("rue 1", Road.types.express, 80, 1000, chunnel, paris);
        System.out.println(brit.toString() + " " + brit.getLoacationStart().toString());
        System.out.println(frnch.toString());
    }
}