package Builder;

public class House {
	private String type;
    private int rooms;
    private int MinWindows;
    private int floors;
    private Walls walls;
    private Roof roof;

    public House(String type, int rooms, int minWindows, int floors, Walls walls, Roof roof) {
        this.type = type;
        this.rooms = rooms;
        this.MinWindows = minWindows;
        this.floors = floors;
        this.walls = walls;
        this.roof = roof;
    }

    public String getType() {
        return type;
    }

    public int getRooms() {
        return rooms;
    }

    public int getMinWindows() {
        return MinWindows;
    }

    public int getFloors() {
        return floors;
    }

    public Walls getWalls() {
        return walls;
    }

    public Roof getRoof() {
        return roof;
    }
}
