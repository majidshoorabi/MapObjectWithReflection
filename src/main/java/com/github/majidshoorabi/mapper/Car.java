package com.github.majidshoorabi.mapper;

/**
 * @author majid.shoorabi
 * @created 2022-04-June
 * @project MapObjectsWithReflection
 */

public class Car {

    private Long id;
    private String name;
    private Boolean hybrid;
    private int model;
    private int sets;

    public Car() {
    }

    public Car(Long id, String name, Boolean hybrid, int model, int sets) {
        this.id = id;
        this.name = name;
        this.hybrid = hybrid;
        this.model = model;
        this.sets = sets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHybrid() {
        return hybrid;
    }

    public void setHybrid(Boolean hybrid) {
        this.hybrid = hybrid;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hybrid=" + hybrid +
                ", model=" + model +
                ", sets=" + sets +
                '}';
    }
}
