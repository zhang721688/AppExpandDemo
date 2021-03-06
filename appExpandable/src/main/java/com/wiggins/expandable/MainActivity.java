package com.wiggins.expandable;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;

import com.wiggins.expandable.base.BaseActivity;
import com.wiggins.expandable.utils.Constant;
import com.wiggins.expandable.utils.UIUtils;
import com.zxn.widget.ExpandableTextView;
import com.zxn.widget.MoreLineTextView;
import com.wiggins.expandable.widget.TitleView;


/**
 * @Description TextView多文本折叠/展开效果
 * @Author 一花一世界
 */
public class MainActivity extends BaseActivity {

    private TitleView titleView;
    private MoreLineTextView mTvMoreLineShort;
    private ExpandableTextView mTvExpandableShort;
    private MoreLineTextView mTvMoreLineLong;
    private ExpandableTextView mTvExpandableLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setAppTitle(UIUtils.getString(R.string.title));
        titleView.setLeftImageVisibility(View.GONE);
        mTvMoreLineShort = (MoreLineTextView) findViewById(R.id.tv_more_line_short);
        mTvExpandableShort = (ExpandableTextView) findViewById(R.id.tv_expandable_short);
        mTvMoreLineLong = (MoreLineTextView) findViewById(R.id.tv_more_line_long);
        mTvExpandableLong = (ExpandableTextView) findViewById(R.id.tv_expandable_long);
    }

    private void initData() {
        mTvMoreLineShort.setText(Constant.content1);
        mTvExpandableShort.setText(Constant.content2);
        mTvMoreLineLong.setText(Constant.content3);
        //mTvExpandableLong.setText(Constant.content4);

        String text = Constant.content4;
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFEB78")), 1, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#E51C23")), 10, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //tvDescription.setText(spannableString);
        mTvExpandableLong.setText(spannableString);
    }

}
