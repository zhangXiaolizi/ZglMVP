package com.zgl.personal.zglmvp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.zgl.personal.zglmvp.R;
import com.zgl.personal.zglmvp.adapter.AvatarGridAdapter;
import com.zgl.personal.zglmvp.bean.AvatarBean;
import com.zgl.personal.zglmvp.presenter.AvatarNetWorkPersenter;
import com.zgl.personal.zglmvp.view.AvatarListView;

import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public class AvatarGridActivity extends Activity implements AvatarListView
{
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        AvatarNetWorkPersenter presenter = new AvatarNetWorkPersenter(this);

        presenter.bindData();
    }


    @Override
    public void showProgress()
    {
        Toast.makeText(this, "数据加载中。。。", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(List<AvatarBean> result)
    {
        gridView.setAdapter(new AvatarGridAdapter(this,result));
    }
}
