package gjj.com.myapp.myinfo;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gjj.com.myapp.R;
import gjj.com.myapp.baseframework.mvp.MvpFragment;
import gjj.com.myapp.model.Student;
import gjj.com.myapp.model.Tutor;
import gjj.com.myapp.myinfo.adapter.MyStudentListAdapter;
import gjj.com.myapp.presenter.MyInfoPresenter;
import gjj.com.myapp.utils.Constants;
import gjj.com.myapp.views.MyInfoView;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends MvpFragment<MyInfoPresenter> implements MyInfoView, MyStudentListAdapter.CallBackListener {


    @BindView(R.id.nameTv)
    TextView mNameTv;
    @BindView(R.id.sexTv)
    TextView mSexTv;
    @BindView(R.id.worker_numTv)
    TextView mWorkerNumTv;
    @BindView(R.id.departmentTv)
    TextView mDepartmentTv;
    @BindView(R.id.replyStudentRecyclerView)
    RecyclerView mReplyStudentRecyclerView;
    @BindView(R.id.student_tv)
    TextView mStudentTv;
    private MyStudentListAdapter adapter;

    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        mReplyStudentRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mReplyStudentRecyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new MyStudentListAdapter(getActivity());
        mReplyStudentRecyclerView.setAdapter(adapter);
        adapter.setCallBackListener(this);
    }


    @Override
    protected void initData() {
        mvpPresenter.loadMyInfo();
    }

    @Override
    protected MyInfoPresenter createPresenter() {
        return new MyInfoPresenter(this);
    }


//    @OnClick(R.id.mystudent_btn)
//    public void onViewClicked() {
//        startActivity(new Intent(getActivity(), MyStudentActivity.class));
//    }


    @Override
    public void showMyInfo(Tutor tutor) {
        if (tutor != null) {
            mNameTv.setText(tutor.getName());
            mSexTv.setText(tutor.getSex());
            mWorkerNumTv.setText(tutor.getNo());
            mDepartmentTv.setText(tutor.getDepartmentName());
            List<Student> students = tutor.getStudentList();
            if (students != null && students.size() != 0) {
                adapter.addList(students);
            } else {
                mStudentTv.setText("暂无分配学生");
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    /**
     * 电话和信息图片的点击事件
     * @param phoneNumber
     * @param flag
     */
    @Override
    public void onItemClick(String phoneNumber, int flag) {
        if (!TextUtils.isEmpty(phoneNumber)) {
            switch (flag){
                case Constants.PHONE:
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber));
                    startActivity(intent);
                    break;
                case Constants.MESSAGE:
                    Intent messageIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+phoneNumber));
                    startActivity(messageIntent);
                    break;
            }
        }else {
            Toast.makeText(getActivity(), "手机号不能为空", Toast.LENGTH_SHORT).show();
        }

    }
}
