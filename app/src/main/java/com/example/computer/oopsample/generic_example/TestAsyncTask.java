package com.example.computer.oopsample.generic_example;

import android.os.AsyncTask;

/**
 * Created by computer on 2017. 4. 5..
 */

public class TestAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    @Override
    protected void onProgressUpdate(Progress... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Result doInBackground(Params... params) {
        return null;
    }

    @Override
    protected void onPostExecute(Result result) {
        super.onPostExecute(result);
    }
}
