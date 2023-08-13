package com.byxx.gtz.remote;

import com.byxx.gtz.DTO.CrhJxTest1DTO;

import java.util.List;

/**
 * @author js
 * @create 2023/8/11
 */
public interface TextRemote {

    /**
     * ��ѯ����
     * @return
     * @throws Exception
     */
    public List<CrhJxTest1DTO> listAllJxTestDto() throws Exception;

    /**
     * �����û�����ѯ����
     * @param userName
     * @return
     * @throws Exception
     */
    public List<CrhJxTest1DTO> listAllJxTsetDtoByUserName(String userName) throws Exception;

    /**
     * ɾ������
     * @param dto
     * @return
     * @throws Exception
     */
    public int deleteJxCrossMutual(CrhJxTest1DTO dto) throws Exception;

    /**
     * ��������
     * @param dto
     * @return
     * @throws Exception
     */
    public CrhJxTest1DTO insertCrhJxTest(CrhJxTest1DTO dto) throws Exception;

    /**
     * ��������
     * @param dto
     * @return
     * @throws Exception
     */
    public CrhJxTest1DTO updateCrhJxTest(CrhJxTest1DTO dto) throws Exception;
}
