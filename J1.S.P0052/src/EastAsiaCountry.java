/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EastAsiaCountry extends Country {

    private String countryTerrain;

    public EastAsiaCountry() {
    }

    public EastAsiaCountry(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountry(String countryTerrain, String name, String code, float totalArea) {
        super(name, code, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public void display() {
        System.out.printf("%-10s %-15s %-15s %-15s\n" , super.code , super.name , super.totalArea , countryTerrain);
    }
}
