package com.zgl.personal.zglmvp.presenter;

import com.zgl.personal.zglmvp.base.IModel;
import com.zgl.personal.zglmvp.base.IPresenter;
import com.zgl.personal.zglmvp.model.AvatarListModel;
import com.zgl.personal.zglmvp.view.AvatarListView;

import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public class AvatarListPersenter implements IPresenter
{
    private IModel model;
    private AvatarListView view;

    public AvatarListPersenter(AvatarListView view)
    {
        this.view = view;
    }

    /**
     * Presenter从网络上夹在数据并且交由View处理
     */
    public void fetch()
    {
        view.showProgress();
        model = new AvatarListModel();
        model.loadData(new AvatarListModel.ResultCallBack()
        {
            @Override
            public void onResult(List result)
            {
                view.showData(result);
            }
        });
    }
}