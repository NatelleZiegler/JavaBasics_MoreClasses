public class RoomCarpet {
	private RoomDimension myRoom;
	private double cost; //cost of carpet per square foot
	
	//mutators
	public void setRoomDimension(double length, double width) {
		myRoom = new RoomDimension(length, width); 
	}
	
	public void setRoomDimension(RoomDimension userRoom) {
		myRoom = new RoomDimension(userRoom.getLength(), userRoom.getWidth());
	}
	
	public void setCost(double price) {
		cost = price;
	}
	
	//getters
	public RoomDimension getRoomDimension() {
		return new RoomDimension(myRoom.getLength(), myRoom.getWidth());
	}
	
	public double getCost() {
		return cost;
	}
	
	//method that returns the total cost of the carpet
	public double getTotalCost() {
		double totalCost = cost * myRoom.getArea();
		return totalCost;
	}
}