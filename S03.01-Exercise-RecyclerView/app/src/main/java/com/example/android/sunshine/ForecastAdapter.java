package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Deepak Kumar Nandagopal on 8/29/2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String mWeatherData[];
    private static final String TAG = ForecastAdapter.class.getSimpleName();

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(R.layout.forecast_list_item, parent, shouldAttachToParentImmediately );
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        Log.d(TAG,"#"+position);
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null)
            return 0;
        else
            return mWeatherData.length;
    }

    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }



    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder
    {
        public TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view)
        {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }


    }
}
