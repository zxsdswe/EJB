package com.byxx.gtz;

import com.byxx.gtz.remote.TextRemote;
import com.byxx.gtz.utils.EjbProxy;

import javax.naming.NamingException;

public class KdTestDelegate extends EjbProxy {
    private static KdTestDelegate instance =null;

    public static KdTestDelegate getInstance(){
        if(instance==null){
            instance = new KdTestDelegate();
        }
        return instance;
    }

    private TextRemote textRemote;

    public TextRemote getTextRemote() throws Exception{
        if(textRemote==null){
            try {
                textRemote = (TextRemote) getEJBLink().lookup("textBean#com.byxx.gtz.remote.TextRemote");
            }catch (NamingException e){
                e.printStackTrace();
                throw e;
            }
        }
        return textRemote;
    }
}
