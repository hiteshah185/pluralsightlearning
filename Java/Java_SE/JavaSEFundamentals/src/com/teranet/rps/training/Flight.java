package com.teranet.rps.training;

import java.time.LocalDateTime;

public class Flight {
    private int passengers;
    private int pilots;
    private int maxSeatingCapacity;
    private String destinationLocation;
    private String departureLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int airHosts;

    public Flight() {
    }

    public Flight(int passengers, int pilots, int maxSeatingCapacity, String destinationLocation, String departureLocation, LocalDateTime departureTime, LocalDateTime arrivalTime, int airHosts) {
        this.passengers = passengers;
        this.pilots = pilots;
        this.maxSeatingCapacity = maxSeatingCapacity;
        this.destinationLocation = destinationLocation;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airHosts = airHosts;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPilots() {
        return pilots;
    }

    public void setPilots(int pilots) {
        this.pilots = pilots;
    }

    public int getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    public void setMaxSeatingCapacity(int maxSeatingCapacity) {
        this.maxSeatingCapacity = maxSeatingCapacity;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAirHosts() {
        return airHosts;
    }

    public void setAirHosts(int airHosts) {
        this.airHosts = airHosts;
    }
    public void addPassenger(){
        if(this.passengers<this.maxSeatingCapacity){
            this.passengers++;
        }else{
            handleTooManyPassenger();
        }
    }
    private void handleTooManyPassenger(){
        System.out.println("Too Many Passengers");
    }
    public void removePassenger(){
        this.passengers--;
    }

    private void takeOff(){

    }
    private void fly(){

    }
    private void land(){

    }
}
