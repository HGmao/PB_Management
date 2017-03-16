package com.base.service;

import java.util.List;

import com.base.po.ApplyDept;
import com.base.po.Major;
import com.base.po.basetype;

public interface baseApplyService {
    /**
     * 得到对应部门
     * @param type 基地类型
     * @return
     */
    public List<ApplyDept> getDept(int type);
    /**
     * 获取基地类型
     * @return
     */
    public  List<basetype> getBasetype();
    /**
     * 获取学院对应的专业
     * @param aid 学院id
     * @return
     */
    public List<Major> getMajor(int aid);
    /**
     * 插入用户基地申请信息
     * @param str1 基地名称id 申报部门id 基地类型id等的string字符串
     * @param str2 (基地id,专业id)
     * @param infostr 要插入的信息
     */
    public void getRequestBaseInfo(String str1,String str2,String infostr);
    /**
     * 是否数据库存在此名字
     * @param name 用户输入的基地名称
     * @return
     */
    public int CheckName(String name);
}
