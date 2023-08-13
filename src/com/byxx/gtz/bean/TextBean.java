package com.byxx.gtz.bean;

import com.byxx.gtz.DTO.CrhJxTest1DTO;
import com.byxx.gtz.OpManager;
import com.byxx.gtz.remote.TextRemote;
import weblogic.javaee.TransactionTimeoutSeconds;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author js
 * @create 2023/8/11
 */

@Stateless(mappedName = "textBean")
@TransactionTimeoutSeconds(value = 360)
public class TextBean implements TextRemote {
    @PersistenceContext(unitName =  "kdDS")
    private EntityManager em =null;

    private OpManager opManager;

    private OpManager getOpManager(){
        if(opManager==null){
            opManager = new OpManager(em);
        }
        return opManager;
    }

    public EntityManager getEm(){
        return em;
    }

    @Override
    public List<CrhJxTest1DTO> listAllJxTestDto() throws Exception {
        return getOpManager().getOpCrhJxTest().listAllJxTestDto();
    }

    @Override
    public List<CrhJxTest1DTO> listAllJxTsetDtoByUserName(String userName) throws Exception {
        return getOpManager().getOpCrhJxTest().listAllJxTsetDtoByUserName(userName);
    }

    @Override
    public int deleteJxCrossMutual(CrhJxTest1DTO dto) throws Exception {
        return getOpManager().getOpCrhJxTest().deleteJxCrossMutual(dto);
    }

    @Override
    public CrhJxTest1DTO insertCrhJxTest(CrhJxTest1DTO dto) throws Exception {
        return getOpManager().getOpCrhJxTest().insert(dto);
    }

    @Override
    public CrhJxTest1DTO updateCrhJxTest(CrhJxTest1DTO dto) throws Exception {
        return getOpManager().getOpCrhJxTest().update(dto);
    }
}
