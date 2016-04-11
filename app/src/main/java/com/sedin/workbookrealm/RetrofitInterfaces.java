package com.sedin.workbookrealm;

import com.sedin.workbookrealm.parser.WorkOrder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by raja on 07/04/16.
 */
public interface RetrofitInterfaces {

    @GET("workorders")
    Call<List<WorkOrder>> getListOfWorkOrders();
}
