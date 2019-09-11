package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask testJoke = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String output) {
            }
        };
        testJoke.execute();
        String joke = testJoke.get();
        assertEquals("This is totally a funny joke", joke);
    }
}
