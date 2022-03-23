package com.example.notificationmoduledesign.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.notificationmoduledesign.AdapterClass.CardModelP3RejectedAdapter;
import com.example.notificationmoduledesign.JavaClass.CardModelRejectedP3;
import com.example.notificationmoduledesign.NotificationApi.ApiClient;
import com.example.notificationmoduledesign.NotificationApi.ApiService;
import com.example.notificationmoduledesign.NotificationApi.GetRejectedUsersResponse;
import com.example.notificationmoduledesign.NotificationApi.Item;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class RejectedFragmentP3 extends Fragment {

    private String title;
    private RecyclerView recyclerView;
    private View view;
    private ArrayList<CardModelRejectedP3> cardModels;
    private Retrofit retrofit;
    private ApiService apiService;


    GetRejectedUsersResponse getRejectedUsersResponse;
    private RecyclerView.LayoutManager layoutManager;
    private CardModelP3RejectedAdapter recyclerViewAdapter;

    public RejectedFragmentP3() {

        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_rejected_p3, container, false);
        apiInit();
        getRejectedUsersResponse();
        return view;
    }

    private void apiInit() {
        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();
    }

    private void getRejectedUsersResponse() {
        String status = "Pending";
        Call<GetRejectedUsersResponse> call = apiService.getRejectedUserCall();
        call.enqueue(new Callback<GetRejectedUsersResponse>() {
            @Override
            public void onResponse(Call<GetRejectedUsersResponse> call, Response<GetRejectedUsersResponse> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getRejectedUsersResponse = response.body();
                Toast.makeText(getContext(), String.valueOf(getRejectedUsersResponse.meta.itemsPerPage), Toast.LENGTH_LONG).show();
                ArrayList<Item> itemArrayList = getRejectedUsersResponse.getItems();
                cardModels = new ArrayList<>();
                int i1=itemArrayList.size();
                Log.i("list", String.valueOf(i1));
                for (Item i :
                        itemArrayList) {
                    cardModels.add(new CardModelRejectedP3( i.getName(),
                            i.getPhone(),
                            i.getRejectedOnDate(),
                            i.getRejectedOnTime()));
                }
                buildRecyclerview();
            }

            @Override
            public void onFailure(Call<GetRejectedUsersResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
            }
        });
    }


    private void buildRecyclerview() {
        recyclerView = view.findViewById(R.id.recyclerViewRU);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new CardModelP3RejectedAdapter(cardModels, getContext());
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}

