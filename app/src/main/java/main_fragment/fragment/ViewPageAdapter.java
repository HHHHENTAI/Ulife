package main_fragment.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

//ViewPager适配器
public class ViewPageAdapter extends FragmentPagerAdapter {

        //数据源List
        private List<String> list;

        public ViewPageAdapter(FragmentManager fm, List<String> list) {
            super(fm);
            this.list = list;
        }

        //在创建时调用，返回一个fragment，他会判断是哪个fragment
        @Override
        public Fragment getItem(int position) {
            return tab_item_fragment.newInstance(position);
        }


        /*「说白了就是返回可滑动视图的个数」*/
        @Override
        public int getCount() {
            return list.size();
        }

         /*根据位置返回当前所对应的标题。*/
        @Override
        public CharSequence getPageTitle(int position) {
            return list.get(position);
        }
    }


