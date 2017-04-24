package gjj.com.myapp.myproject;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gjj.com.myapp.R;
import gjj.com.myapp.baseframework.base.BaseActivity;

public class ProjectDetailActivity extends BaseActivity {

    @BindView(R.id.title_tv)
    TextView mTitleTv;
    @BindView(R.id.title_Tv)
    TextView mTitleNameTv;
    @BindView(R.id.subtitleTv)
    TextView mSubtitleTv;
    @BindView(R.id.projectTypeTv)
    TextView mProjectTypeTv;
    @BindView(R.id.projectFidelityTv)
    TextView mProjectFidelityTv;
    @BindView(R.id.projectFromTv)
    TextView mProjectFromTv;
    @BindView(R.id.yearTv)
    TextView mYearTv;
    @BindView(R.id.majorTv)
    TextView mMajorTv;
    @BindView(R.id.approveStateTv)
    TextView mApproveStateTv;
    @BindView(R.id.student_nameTv)
    TextView mStudentNameTv;
    @BindView(R.id.contentTv)
    TextView mContentTv;
    @BindView(R.id.basicRequirementTv)
    TextView mBasicRequirementTv;
    @BindView(R.id.basicSkillTv)
    TextView mBasicSkillTv;
    @BindView(R.id.referenceTv)
    TextView mReferenceTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);
        ButterKnife.bind(this);
        mTitleTv.setText("我的报题详情");
    }
}