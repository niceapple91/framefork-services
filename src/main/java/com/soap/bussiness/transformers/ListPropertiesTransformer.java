package com.soap.bussiness.transformers;

import com.soap.properties.SimplePropertyCreator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 04.09.2016.
 */
public class ListPropertiesTransformer {


        public Object getProperty(Class clazz, String propName, String fieldName){
            List<String> listProp = new ArrayList<>();
            SimplePropertyCreator reader = new SimplePropertyCreator();
            listProp.add(reader.getProperty(propName));
            return setPropList(clazz, listProp, fieldName);
        }

        private Object setPropList(Class clazz, List<String> listProp, String fieldName){
            Field f;
            Object prop = null;
            try {
                prop = clazz.newInstance();
                f = clazz.getDeclaredField(fieldName);
                f.setAccessible(true);
                f.set(prop, listProp);
                return prop;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public Object getProperty(Class clazz, String fieldName, String... vargs){
            List<String> listProp = new ArrayList<>();
            SimplePropertyCreator reader = new SimplePropertyCreator();
            for (String propertyName: vargs) {
                listProp.add(reader.getProperty(propertyName));
            }
            return setPropList(clazz, listProp, fieldName);
        }
    }

