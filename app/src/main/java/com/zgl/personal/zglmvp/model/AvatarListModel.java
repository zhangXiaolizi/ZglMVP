package com.zgl.personal.zglmvp.model;

import com.zgl.personal.zglmvp.R;
import com.zgl.personal.zglmvp.base.BaseModel;
import com.zgl.personal.zglmvp.bean.AvatarBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public class AvatarListModel implements BaseModel
{
    @Override
    public void loadData(ResultCallBack callBack)
    {
        List<AvatarBean> list = new ArrayList<AvatarBean>();
        list.add(new AvatarBean(R.mipmap.image_1,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_2,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_3,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_4,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_5,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_6,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_7,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_8,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_9,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_10,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_11,"XiaoMing"));
        list.add(new AvatarBean(R.mipmap.image_12,"XiaoMing"));
        //加载完成数据后回调处理
        callBack.onResult(list);
    }
}
