enum roads{
    highway, express, country
}
enum locations{
    cities, airport, station
}
class Coords{
    public int x,y;
}
class Road{
    private String name;
    private roads type;
    private int speedLimit;

    public String getName(){
        return name;
    }
    public roads getType(){
        return type;
    }
    public int getSpeedLimit(){
        return speedLimit;
    }
    public Road(String iName, roads iRoadType, int iSpeedLimit ){
        name = iName;
        type = iRoadType;
        speedLimit = iSpeedLimit;
    }

}

class Location{
    private String name;
    private locations type;
    private Coords pos;

    public String getName(){
        return name;
    }
    public locations getType(){
        return type;
    }
    public Coords getPos(){
        return pos;
    }
    public Location(String iName, locations iLocation, Coords iPos){
        name = iName;
        type = iLocation;
        pos = iPos;
    }
}

class oWorld {
    public static void main(String[] args) {
        System.out.println("Basic stuff ig!"); 
    }
}