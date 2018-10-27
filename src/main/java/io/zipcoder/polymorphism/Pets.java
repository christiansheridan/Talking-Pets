package io.zipcoder.polymorphism;

public abstract class Pets {

    String name;
    String type;

    /*
    public Pets(String petName, String petType){
        name = petName;
        type = petType;
    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();


}
