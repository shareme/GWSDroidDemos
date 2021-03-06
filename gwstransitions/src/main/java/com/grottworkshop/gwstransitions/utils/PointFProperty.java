package com.grottworkshop.gwstransitions.utils;


import android.graphics.PointF;

import android.util.Property;


/**
 * Created by fgrott on 8/19/2015.
 */
public abstract class PointFProperty<T> extends Property<T, PointF> {

    public PointFProperty(String name) {
        super(PointF.class, name);
    }

    @Override
    public PointF get(T object) {
        return null;
    }

}
