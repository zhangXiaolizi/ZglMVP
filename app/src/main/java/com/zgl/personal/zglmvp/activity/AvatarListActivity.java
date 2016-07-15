package com.zgl.personal.zglmvp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.zgl.personal.zglmvp.R;
import com.zgl.personal.zglmvp.adapter.AvatarListAdapter;
import com.zgl.personal.zglmvp.bean.AvatarBean;
import com.zgl.personal.zglmvp.presenter.AvatarListPersenter;
import com.zgl.personal.zglmvp.view.AvatarListView;

import java.util.List;

public class AvatarListActivity extends Activity implements AvatarListView
{
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        AvatarListPersenter presenter = new AvatarListPersenter(this);
        presenter.fetch();

    }

    @Override
    public void showProgress()
    {
        Toast.makeText(this, "一大波美女即将到来", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(List<AvatarBean> result)
    {
        listView.setAdapter(new AvatarListAdapter(this,result));
    }

}
