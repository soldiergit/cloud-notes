package com.soldier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.soldier.util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author soldier
 * @Date 2020/4/23 7:21
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:笔记更改逻辑代码
 */
public class MyListAdapter extends BaseAdapter {
    private static List<Map<String, Object>> list;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    ViewHolder holder = null;
    static int count;

    class ViewHolder {
        public TextView Title, Note, Date;
    }

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position).get("Ndata");
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (list == null) {
            GetNote(MainActivity.uid);
        }
        //GetNote();
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list, null);
            holder = new ViewHolder();
            holder.Title = convertView.findViewById(R.id.Title);
            holder.Note = convertView.findViewById(R.id.Note);
            holder.Date = convertView.findViewById(R.id.Date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.Title.setText(list.get(position).get("Title").toString().trim());
        holder.Note.setText(list.get(position).get("Data").toString().trim());
        holder.Date.setText(list.get(position).get("DateTime").toString().trim());
        return convertView;
    }


    //SELECT * FROM `test`.`ndata` where UID = 60 ORDER BY `Ndata` DESC  LIMIT 0,10 ;
    //对获取笔记列表SQL进行分页
    public static void GetNote(final String Uid) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                DBUtil dbUtil = new DBUtil();
                try {
                    Connection conn = dbUtil.getConnection();
                    List<Map<String, Object>> list1 = dbUtil.execQuery("select * from ndata where UID = " + Uid, null);
                    list = list1;
                    count = list.size();
                    //关闭数据库对象
                    dbUtil.close(null, null, conn);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
