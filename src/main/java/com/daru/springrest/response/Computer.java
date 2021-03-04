package com.daru.springrest.response;

public class Computer {

    String motherboard;
    String GPU;
    int RAM;

    public Computer(String motherboard, String GPU, int RAM) {
        this.motherboard = motherboard;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
