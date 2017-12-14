package com.pgg.mywechatem.Adapter.ChatAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.easemob.chat.EMGroup;
import com.pgg.mywechatem.Activity.Chat_Activity.ChatActivity;
import com.pgg.mywechatem.Holder.ViewHolder;
import com.pgg.mywechatem.R;
import com.pgg.mywechatem.Uitils.Constants;

import java.util.List;

public class MyGroupAdapter extends BaseAdapter {
	protected Context context;
	private List<EMGroup> grouplist;

	public MyGroupAdapter(Context ctx, List<EMGroup> grouplist) {
		context = ctx;
		this.grouplist = grouplist;
	}

	@Override
	public int getCount() {
		return grouplist.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(
					R.layout.layout_item_mygroup, parent, false);
		}
		final EMGroup group = grouplist.get(position);
		ImageView img_avar = ViewHolder.get(convertView, R.id.img_photo);
		TextView txt_name = ViewHolder.get(convertView, R.id.txt_name);
		img_avar.setImageResource(R.drawable.defult_group);
		txt_name.setText(group.getGroupName());
		convertView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, ChatActivity.class);
				intent.putExtra(Constants.NAME, group.getGroupName());
				intent.putExtra(Constants.TYPE, ChatActivity.CHATTYPE_GROUP);
				intent.putExtra(Constants.GROUP_ID, group.getGroupId());
				context.startActivity(intent);
			}
		});
		return convertView;
	}
}
