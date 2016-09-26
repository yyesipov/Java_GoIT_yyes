package module5.homework;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvaliableFrom;
    private String hotelName;
    private String cityName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvaliableFrom() {
        return dateAvaliableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvaliableFrom(Date dateAvaliableFrom) {
        this.dateAvaliableFrom = dateAvaliableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Room(long id, int price, int persons, Date dateAvaliableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvaliableFrom = dateAvaliableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }


}
