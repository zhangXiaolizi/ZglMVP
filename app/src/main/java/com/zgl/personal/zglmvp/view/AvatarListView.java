package com.zgl.personal.zglmvp.view;

import com.zgl.personal.zglmvp.bean.AvatarBean;

import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public interface AvatarListView
{
    /**
     * 显示加载弹窗
     */
    void showProgress();

    /**
     * 获取数据之后显示数据
     */
    void showData(List<AvatarBean> result);
}
