package Builder;

public class Director {
    public void buildLargeHouse(Builder builder){
        builder.setType("Large House");
        builder.setRooms(12);
        builder.setFloors(4);
        builder.setMinWindows(3);
        builder.setRoof(new Roof("Dormer"));
        builder.setWalls(new Walls("Gold"));// :)
    }

    public void buildAverageHouse(Builder builder){
        builder.setType("Average House");
        builder.setRooms(6);
        builder.setFloors(2);
        builder.setMinWindows(2);
        builder.setRoof(new Roof("Open Gable"));
        builder.setWalls(new Walls("Stone and Iron"));
    }

    public void buildSmallHouse(Builder builder){
        builder.setType("Small House");
        builder.setRooms(3);
        builder.setFloors(1);
        builder.setMinWindows(2);
        builder.setRoof(new Roof("Flat"));
        builder.setWalls(new Walls("Wood"));
    }
}
