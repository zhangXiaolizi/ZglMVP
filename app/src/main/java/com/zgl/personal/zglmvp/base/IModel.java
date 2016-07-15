package com.zgl.personal.zglmvp.base;

import java.util.List;

/**
 * MVP中的model接口
 * Created by 小立子 on 2016/7/14.
 */

public interface IModel
{
    void loadData(ResultCallBack callBack);

    /**
     * 加载完数据之后回调的函数
     */
    interface ResultCallBack
    {
        void onResult(List result);
    }
}
