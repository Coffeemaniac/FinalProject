package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class NonEmptyStringTest extends AndroidTestCase implements EndpointAsyncTask.callBackToMainActivity {

    @SuppressWarnings("unchecked")
    public void test() {

        String result = null;
        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask(this);
        endpointAsyncTask.execute(getContext());

        /*
        try {
            result = endpointsAsyncTask.get();
            Log.v("TEST_TAG", "Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result); */
    }

    @Override
    public void sendInfo(String data){
            assertNotNull(data);
    }

}
