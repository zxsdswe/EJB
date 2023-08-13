package com.byxx.gtz;

import com.byxx.gtz.OP.OpCrhJxTest;

import javax.persistence.EntityManager;

public class OpManager {
    private EntityManager em = null;

    private OpCrhJxTest opCrhJxTest;

    public OpCrhJxTest getOpCrhJxTest() {
        if(opCrhJxTest==null){
            opCrhJxTest = new OpCrhJxTest( this);
        }
        return opCrhJxTest;
    }

    public EntityManager getEm(){
        return this.em;
    }
    public OpManager(EntityManager em){
        this.em = em;
    }
}
