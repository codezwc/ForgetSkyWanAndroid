package com.forgetsky.wanandroid.modules.homepager.presenter;

import com.forgetsky.wanandroid.base.presenter.BasePresenter;
import com.forgetsky.wanandroid.modules.homepager.contract.HomePagerContract;

import javax.inject.Inject;

public class HomePagerPresenter extends BasePresenter<HomePagerContract.View>
        implements HomePagerContract.Presenter {

    @Inject
    HomePagerPresenter() {
        super();
    }
    private int currentPage;

    @Override
    public void setCurrentPage(int page) {
        currentPage = page;
    }

    @Override
    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public void refreshLayout(boolean isShowError) {

    }

    @Override
    public void loadMore() {

    }


    @Override
    public void attachView(HomePagerContract.View view) {
        super.attachView(view);
    }
}
