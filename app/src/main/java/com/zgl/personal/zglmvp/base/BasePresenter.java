package com.zgl.personal.zglmvp.base;

import java.lang.ref.WeakReference;

/**
 * Created by 小立子 on 2016/7/14.
 */

public abstract class BasePresenter<T>
{
    protected WeakReference<T> mViewRef;

    /**
     * Presenter关联View,使用弱引用保证在View被销毁之后及时回收内存，避免内存泄漏
     * @param view
     */
    public void attachView(T view)
    {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView()
    {
        if (mViewRef != null)
        {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected T getView()
    {
        return mViewRef.get();
    }

}
