/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author KHOI - LAPTOP
 */
public class Room implements Serializable
{
    private String id;
    private String floorNo;
    private String roomNo;
    private Double priceEach;
    private String nightNo;
    private Double total;
    private String bookDay;

    public Room(String id, String floorNo, String roomNo, Double priceEach, String nightNo, Double total, String bookDay) {
        this.id = id;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.priceEach = priceEach;
        this.nightNo = nightNo;
        this.total = total;
        this.bookDay = bookDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Double priceEach) {
        this.priceEach = priceEach;
    }

    public String getNightNo() {
        return nightNo;
    }

    public void setNightNo(String nightNo) {
        this.nightNo = nightNo;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getBookDay() {
        return bookDay;
    }

    public void setBookDay(String bookDay) {
        this.bookDay = bookDay;
    }

}
