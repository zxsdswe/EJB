package com.byxx.gtz.OP;

import com.byxx.gtz.DTO.CrhJxTest1DTO;
import com.byxx.gtz.OpManager;
import com.byxx.gtz.utils.EjbBasicDAO;

import java.util.List;

public class OpCrhJxTest extends EjbBasicDAO<CrhJxTest1DTO> {
    public OpCrhJxTest(OpManager opConstruct){
        super(opConstruct.getEm());
    }

    public List<CrhJxTest1DTO> listAllJxTestDto() throws Exception{
        String ejbQ1 = "select o from CrhJxTest1DTO o";
        return getListByEjbQl(ejbQ1);
    }

    public List<CrhJxTest1DTO> listAllJxTsetDtoByUserName(String userName) throws Exception{
        String ejbQ1 = "select o from CrhJxTest1DTO o where o.userName=:userName";
        return getListByEjbQl(ejbQ1, new String[]{"userName"}, userName);
    }

    public int deleteJxCrossMutual(CrhJxTest1DTO dto) throws Exception{
        String ejbQ1 = "delete from CrhJxTest1DTO o where o.id=:id";
        return execUpdateByEjbQl(ejbQ1, new String[]{"id"}, dto.getId());
    }
}
