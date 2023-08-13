package com.byxx.gtz.remote;

import com.byxx.gtz.DTO.CrhJxTest1DTO;

import java.util.List;

/**
 * @author js
 * @create 2023/8/11
 */
public interface TextRemote {

    /**
     * 查询所有
     * @return
     * @throws Exception
     */
    public List<CrhJxTest1DTO> listAllJxTestDto() throws Exception;

    /**
     * 根据用户名查询数据
     * @param userName
     * @return
     * @throws Exception
     */
    public List<CrhJxTest1DTO> listAllJxTsetDtoByUserName(String userName) throws Exception;

    /**
     * 删除数据
     * @param dto
     * @return
     * @throws Exception
     */
    public int deleteJxCrossMutual(CrhJxTest1DTO dto) throws Exception;

    /**
     * 插入数据
     * @param dto
     * @return
     * @throws Exception
     */
    public CrhJxTest1DTO insertCrhJxTest(CrhJxTest1DTO dto) throws Exception;

    /**
     * 更新数据
     * @param dto
     * @return
     * @throws Exception
     */
    public CrhJxTest1DTO updateCrhJxTest(CrhJxTest1DTO dto) throws Exception;
}
