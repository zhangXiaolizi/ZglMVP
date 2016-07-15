package com.zgl.personal.zglmvp.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 小立子 on 2016/7/15.
 */

public abstract class BaseActivity<V ,T extends BasePresenter<V>> extends Activity
{
    protected T presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();

        //将View关联到Presenter
        presenter.attachView((V)this);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        //解除关联
        presenter.detachView();
    }

    /**
     * 获取每个页面中的需要的Presenter，用来获取数据并回调页面处理
     * @return
     */
    protected abstract T createPresenter();


}
