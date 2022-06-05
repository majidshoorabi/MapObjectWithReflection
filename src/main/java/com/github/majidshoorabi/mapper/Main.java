package com.github.majidshoorabi.mapper;


/**
 * @author majid.shoorabi
 * @created 2022-04-June
 * @project MapObjectsWithReflecttion
 */

public class Main {
    public static void main(String[] args) {

        CarVo carVo = new CarVo();
        carVo.setId(10L);
        carVo.setName("Tesla");
        carVo.setModel(2021);
        carVo.setHybrid(true);

        Car car = new Car();
        car.setSets(5);
        Util.fetchUpdate(carVo, car);

        System.out.println(car.toString());


    }



}
