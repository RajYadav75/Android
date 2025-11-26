package in.raj.adaptors;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import in.raj.fragment.FragmentOne;
import in.raj.fragment.FragmentThree;
import in.raj.fragment.FragmentTwo;

public class MyAdaptor extends FragmentPagerAdapter {

    public MyAdaptor(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentOne one = new FragmentOne();
                return one;
            case 1:
                FragmentTwo two = new FragmentTwo();
                return two;
            case 2:
                FragmentThree three = new FragmentThree();
                return three;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

public class MyAdaptor extends FragmentStateAdapter {
    public MyAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                FragmentOne one = new FragmentOne();
                return one;
            case 1:
                FragmentTwo two = new FragmentTwo();
                return two;
            case 2:
                FragmentThree three = new FragmentThree();
                return three;
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

