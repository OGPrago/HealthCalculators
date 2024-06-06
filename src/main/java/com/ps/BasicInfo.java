package com.ps;

public class BasicInfo {

    private String gender;
    private int age;
    private int weightInLbs;
    private int heightInInches;

    public BasicInfo(String gender, int age, int weightInLbs, int heightInInches) {
        this.gender = gender;
        this.age = age;
        this.weightInLbs = weightInLbs;
        this.heightInInches = heightInInches;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeightInLbs() {
        return weightInLbs;
    }

    public void setWeightInLbs(int weightInLbs) {
        this.weightInLbs = weightInLbs;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }
}
