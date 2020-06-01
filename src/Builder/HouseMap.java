package Builder;

public class HouseMap {
	private String type;
    private int rooms;
    private int MinWindows;
    private int floors;
    private Walls walls;
    private Roof roof;

    public HouseMap(String type, int rooms, int minWindows, int floors, Walls walls, Roof roof) {
        this.type = type;
        this.rooms = rooms;
        this.MinWindows = minWindows;
        this.floors = floors;
        this.walls = walls;
        this.roof = roof;
    }

    public String showMap(){
        String returned = "";
        returned += "House Type: " + this.type + "\n";
        returned += "Rooms: " + this.rooms + "\n";
        returned += "Number of Windows in each room: " + this.MinWindows + "\n";
        returned += "Number of floors: " +this.floors + "\n";
        returned += "Wall materials: " + this.walls.getWallType() + "\n";
        returned += "Roof type: " + this.roof.getRoofType() + "\n";
        return returned;
    }
}
