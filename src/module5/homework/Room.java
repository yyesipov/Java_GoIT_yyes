package module5.homework;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private Date dateAvaliableFrom;
    private String hotelName;
    private String cityName;

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
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

    public void setDateAvaliableFrom(Date dateAvaliableFrom) {
        this.dateAvaliableFrom = dateAvaliableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Room(long id, int price, Date dateAvaliableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.dateAvaliableFrom = dateAvaliableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }
}
