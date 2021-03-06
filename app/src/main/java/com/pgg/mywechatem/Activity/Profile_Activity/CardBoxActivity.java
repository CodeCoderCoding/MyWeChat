package com.pgg.mywechatem.Activity.Profile_Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pgg.mywechatem.Activity.BaseActivity;
import com.pgg.mywechatem.R;
import com.pgg.mywechatem.Uitils.Utils;


/**
 * Created by PDD on 2017/11/18.
 */

public class CardBoxActivity extends BaseActivity implements View.OnClickListener{
    private ImageButton ib_exit_01;
    private View vertical_line;
    private TextView title_tv_left;
    private TextView title_tv_center;
    private TextView tv_see_all;
    private RelativeLayout rl_friend_piao;
    private RelativeLayout rl_my_piao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_card_box);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initController() {
        ib_exit_01 =findViewById(R.id.ib_exit_01);
        vertical_line =findViewById(R.id.vertical_line);
        title_tv_left =findViewById(R.id.title_tv_left);
        title_tv_center =findViewById(R.id.title_tv_center);
        tv_see_all=findViewById(R.id.tv_see_all_card);
        rl_friend_piao=findViewById(R.id.rl_friend_piao);
        rl_my_piao=findViewById(R.id.rl_my_piao);
    }

    @Override
    public void initView() {
        ib_exit_01.setVisibility(View.VISIBLE);
        vertical_line.setVisibility(View.VISIBLE);
        title_tv_left.setVisibility(View.VISIBLE);
        title_tv_center.setVisibility(View.GONE);
        title_tv_left.setText("卡包");
        ib_exit_01.setBackgroundResource(R.drawable.ic_menu_exit_left);

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        ib_exit_01.setOnClickListener(this);
        rl_friend_piao.setOnClickListener(this);
        rl_my_piao.setOnClickListener(this);
        tv_see_all.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_exit_01:
                Utils.finish(CardBoxActivity.this);
                break;
            case R.id.tv_see_all_card:
                //查看所有卡包
                break;
            case R.id.rl_my_piao:
                //查看我的票
                break;
            case R.id.rl_friend_piao:
                //朋友的优惠券
                break;
        }
    }
}
