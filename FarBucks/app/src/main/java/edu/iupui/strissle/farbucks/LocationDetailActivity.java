package edu.iupui.strissle.farbucks;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import java.util.UUID;



public class LocationDetailActivity extends SingleFragmentActivity {

    private static final String EXTRA_FARBUCKS_ID = "edu.iupui.strissle.farbucks_id";

    @Override
    protected Fragment createFragment() {
        // return new LocationDetailFragment();
        long farbucksID = (long) getIntent().getSerializableExtra(EXTRA_FARBUCKS_ID);
        return LocationDetailFragment.newInstance(farbucksID);

    }

    public static Intent newIntent(Context packageContext, long farbucksID) {
        Intent intent = new Intent(packageContext, LocationDetailActivity.class);
        intent.putExtra(EXTRA_FARBUCKS_ID, farbucksID);
        return intent;
    }
}



