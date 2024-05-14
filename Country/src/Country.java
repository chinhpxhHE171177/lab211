/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Country {

    protected String code;
    protected String name;
    protected float totalArea;

    public Country() {
    }

    public Country(String code, String name, float totalArea) {
        this.code = code;
        this.name = name;
        this.totalArea = totalArea;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    void display() {
        System.out.println("ID: " + getCode());
        System.out.println("Name: " + getName());
        System.out.println("Total Area: " + totalArea);
    }
}
