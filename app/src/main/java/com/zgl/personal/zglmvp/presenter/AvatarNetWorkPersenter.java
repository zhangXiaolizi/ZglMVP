package com.zgl.personal.zglmvp.presenter;

import com.zgl.personal.zglmvp.base.BaseModel;
import com.zgl.personal.zglmvp.base.BasePresenter;
import com.zgl.personal.zglmvp.model.AvatarListModel;
import com.zgl.personal.zglmvp.model.AvatarNetWorkModel;
import com.zgl.personal.zglmvp.view.AvatarListView;

import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public class AvatarNetWorkPersenter extends BasePresenter<AvatarListView>
{
    private BaseModel model;


    /**
     * Presenter从网络上夹在数据并且交由View处理
     */
    public void bindData()
    {
        getView().showProgress();
        model = new AvatarNetWorkModel();
        model.loadData(new AvatarListModel.ResultCallBack()
        {
            @Override
            public void onResult(List result)
            {
                getView().showData(result);
            }
        });
    }
}
