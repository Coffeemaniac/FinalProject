package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class NonEmptyStringTest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void test() {

        String result = null;
        EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask();
        endpointsAsyncTask.execute(getContext());
        try {
            result = endpointsAsyncTask.get();
            Log.v("TEST_TAG", "Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
