package com.github.majidshoorabi.mapper;

import java.lang.reflect.Field;

/**
 * @author majid.shoorabi
 * @created 2022-04-June
 * @project MapObjectsWithReflection
 */

public class Util {

    public static <T1, T2> T2 fetchUpdate(T1 vo, T2 entity) {

        Class voClass = vo.getClass();
        Class entityClass = entity.getClass();

        try {
            Field[] fields = voClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(vo);
                if (value != null) {
                    Field entityField = entityClass.getDeclaredField(field.getName());
                    entityField.setAccessible(true);
                    entityField.set(entity, value);
                }
            }
            return entity;
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
}
