package Builder;

public interface Builder {
	void setType(String type);
    void setRooms(int rooms);
    void setFloors(int floors);
    void setMinWindows(int minWindows);
    void setWalls(Walls wallsType);
    void setRoof(Roof roof);
}
