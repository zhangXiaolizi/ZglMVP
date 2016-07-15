package com.zgl.personal.zglmvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgl.personal.zglmvp.R;
import com.zgl.personal.zglmvp.bean.AvatarBean;

import java.util.List;

/**
 * Created by 小立子 on 2016/7/14.
 */

public class AvatarGridAdapter extends BaseAdapter
{
    private List<AvatarBean> list;
    private Context context;

    public AvatarGridAdapter(Context context, List<AvatarBean> list)
    {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder = null;
        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_griidview_avatarlist, null);
            viewHolder = new ViewHolder();
            viewHolder.img = (ImageView) convertView.findViewById(R.id.imgAvatar);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.txtName);
            convertView.setTag(viewHolder);
        } else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.img.setImageResource(list.get(position).getAvatarDrawable());
        viewHolder.textView.setText(list.get(position).getAvatarName());

        return convertView;
    }


    //静态语句块，初始化数据
/*    static
    {
        list = new ArrayList<AvatarBean>();
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

    }*/

    class ViewHolder
    {
        private ImageView img;
        private TextView textView;
    }
}
