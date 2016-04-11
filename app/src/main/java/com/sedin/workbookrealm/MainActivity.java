package com.sedin.workbookrealm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sedin.workbookrealm.modules.Asset;
import com.sedin.workbookrealm.modules.WorkOrderModule;
import com.sedin.workbookrealm.parser.WorkOrder;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmResults;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Realm realm;
    RealmConfiguration realmConfig;
    private RealmResults<WorkOrderModule> workOrderRealmList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realmConfig = new RealmConfiguration.Builder(this).build();
        realm = Realm.getInstance(realmConfig);
        workOrderRealmList = realm.where(WorkOrderModule.class).findAll(); // Create the "live" query result

        getListOfWorders();

    }

    private void getListOfWorders() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        Retrofit retrofit = new Retrofit.Builder().client(httpClient.build()).baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create()).build();
        RetrofitInterfaces retrofitInterfaces = retrofit.create(RetrofitInterfaces.class);
        final Call<List<WorkOrder>> workOrders = retrofitInterfaces.getListOfWorkOrders();
        workOrders.enqueue(new Callback<List<WorkOrder>>() {
            @Override
            public void onResponse(Call<List<WorkOrder>> call,
                                   Response<List<WorkOrder>> response) {
                List<WorkOrder> workOrderList = response.body();
                if (workOrderList != null)
                    saveWorkOrders(workOrderList);

            }

            @Override
            public void onFailure(Call<List<WorkOrder>> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void saveWorkOrders(List<WorkOrder> workOrderList) {
        for (WorkOrder workOrder : workOrderList) {
            realm.beginTransaction();
            WorkOrderModule workOrderModule = new WorkOrderModule();
            workOrderModule.setChangedBy(workOrder.getChangedBy() != null ? workOrder.getChangedBy() : "");
            workOrderModule.setEstimatedDuration(workOrder.getEstimatedDuration() != null ? workOrder.getEstimatedDuration() : 0);
            workOrderModule.setLocation(workOrder.getLocation() != null ? workOrder.getLocation() : "");
            workOrderModule.setPhone(workOrder.getPhone() != null ? workOrder.getPhone() : "");
            workOrderModule.setPriority(workOrder.getPriority() != null ? workOrder.getPriority() : 3);
            workOrderModule.setDescription(workOrder.getDescription() != null ? workOrder.getDescription() : "");
            workOrderModule.setAssignedDate(workOrder.getAssignedDate() != null ? workOrder.getAssignedDate() : "");
            realm.copyToRealm(workOrderModule);
            realm.commitTransaction();
        }

    }


}
