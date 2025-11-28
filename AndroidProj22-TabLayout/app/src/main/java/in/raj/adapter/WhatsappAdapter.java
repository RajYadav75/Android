package in.raj.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import in.raj.fragment.Call;
import in.raj.fragment.Chat;
import in.raj.fragment.Status;

public class WhatsappAdapter extends FragmentStateAdapter {
    public WhatsappAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Chat();
            case 1:
                return new Status();
            case 2:
                return new Call();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
