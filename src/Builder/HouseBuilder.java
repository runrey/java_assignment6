package Builder;

public class HouseBuilder implements Builder{
	private String type;
    private int rooms;
    private int MinWindows;
    private int floors;
    private Walls walls;
    private Roof roof;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setMinWindows(int minWindows) {
        MinWindows = minWindows;
    }

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }


    public House getResult(){
        return new House(type, rooms, MinWindows, floors, walls, roof);
    }
}
