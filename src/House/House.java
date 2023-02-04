package House;
import House.Rooms.*;

public class House {

    public static final int MAX_BED_ROOMS = 10;
    public static final int MAX_REST_ROOMS = 10;
    public static int INDEX_BED_ROOMS=0;
    public static int INDEX_REST_ROOMS = 0;
    private Kitchen kitchen;
    private DinningRoom dinningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public void addRoom(BedRoom bedRoom){
        while (INDEX_BED_ROOMS<bedRooms.length){
            bedRooms[INDEX_BED_ROOMS]=bedRoom;
        }

        INDEX_BED_ROOMS++;
    }

    public void addRoom(RestRoom restRoom){
        while (INDEX_REST_ROOMS<restRooms.length){
            restRooms[INDEX_REST_ROOMS]=restRoom;
        }

        INDEX_REST_ROOMS++;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DinningRoom getDinningRoom() {
        return dinningRoom;
    }

    public void setDinningRoom(DinningRoom dinningRoom) {
        this.dinningRoom = dinningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }
}
