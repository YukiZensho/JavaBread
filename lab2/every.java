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
    private Location start, finish;

    public Road(String iName, roads iRoadType, int iSpeedLimit, Location iStart, Location iFinish ){
        name = iName;
        type = iRoadType;
        speedLimit = iSpeedLimit;
        start = iStart;
        finish = iFinish;
    }

    public String getName(){
        return name;
    }
    public roads getType(){
        return type;
    }
    public int getSpeedLimit(){
        return speedLimit;
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
    public void setType(roads newType){
        type = newType;
    }
    public void setSpeedLimit(int newSpeedLimit){
        speedLimit = newSpeedLimit;
    }
    public void setLoacationStart(Location newStart){
        start = newStart;
    }
    public void setLoacationFinish(Location newFinish){
        finish = newFinish;
    }

}

class Location{
    private String name;
    private locations type;
    private Coords pos;

    public Location(String iName, locations iLocation, Coords iPos){
        name = iName;
        type = iLocation;
        pos = iPos;
    }

    public String getName(){
        return name;
    }
    public locations getType(){
        return type;
    }
    public Coords getPos(){
        return pos;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setType(locations newLocation){
        type = newLocation;
    }
    public void setPosition(Coords newPosition){
        pos = newPosition;
    }
}

class oWorld {
    public static void main(String[] args) {
        System.out.println("Basic stuff ig!"); 
    }
}