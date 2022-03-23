package com.example.notificationmoduledesign.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.notificationmoduledesign.AdapterClass.CardModelP3PendingAdapter;
import com.example.notificationmoduledesign.JavaClass.CardModelPendingP3;
import com.example.notificationmoduledesign.NotificationApi.ApiClient;
import com.example.notificationmoduledesign.NotificationApi.ApiService;
import com.example.notificationmoduledesign.NotificationApi.ApproveOrRejectRequest;
import com.example.notificationmoduledesign.NotificationApi.ApproveOrRejectResponse;
import com.example.notificationmoduledesign.NotificationApi.GetPendingUsersResponse;
import com.example.notificationmoduledesign.NotificationApi.GetRejectedUsersResponse;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class PendingFragmentP3 extends Fragment {

    private String title;
    private RecyclerView recyclerView;
    private View view;
    private ArrayList<CardModelPendingP3> cardModels;
    private Retrofit retrofit;
    private ConstraintLayout constraintLayout;
    private ApiService apiService;


    GetPendingUsersResponse getPendingUsersResponse;
    private RecyclerView.LayoutManager layoutManager;
    private CardModelP3PendingAdapter recyclerViewAdapter;

    public PendingFragmentP3() {

        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_pending_p3, container, false);
        constraintLayout = view.findViewById(R.id.constLayoutP3);
        recyclerView=view.findViewById(R.id.recyclerView);
        apiInit();
        getPendingStudentsDetail();
        return view;
    }

    private void apiInit() {
        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();
    }

    private void getPendingStudentsDetail() {
        String status = "Pending";
        Call<GetPendingUsersResponse> call=apiService.getPendingUserCall();
        call.enqueue(new Callback<GetPendingUsersResponse>() {
            @Override
            public void onResponse(Call<GetPendingUsersResponse> call, Response<GetPendingUsersResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                 getPendingUsersResponse = response.body();
                Toast.makeText(getContext(), String.valueOf(getPendingUsersResponse.getSettings().studentAutoApprove), Toast.LENGTH_LONG).show();
                ArrayList<Object> itemArrayList = getPendingUsersResponse.getItems();
                cardModels = new ArrayList<>();
                if(itemArrayList.size()==0)
                {
                    constraintLayout.setVisibility(View.VISIBLE);
                    recyclerView.setVisibility(View.GONE);
                }
                for (Object i :
                        itemArrayList) {
                    cardModels.add(new CardModelPendingP3(234,"grg","grg","rgrghr","rgrerg","2435","5346"));
                }
                buildRecyclerview();
            }

            @Override
            public void onFailure(Call<GetPendingUsersResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
            }
        });
    }



    private void buildRecyclerview() {
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new CardModelP3PendingAdapter(cardModels,getContext());
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setOnItemClickedListener(new CardModelP3PendingAdapter.OnButtonClickedListener() {
            @Override
            public void onRejectClicked(int position) {
                rejectUser("Rejected", cardModels.get(position).getUserId());
                cardModels.remove(position);
                recyclerViewAdapter.notifyItemRemoved(position);
            }

            @Override
            public void onApproveClick(int position) {
                approveUser("Approved", cardModels.get(position).getUserId());
                cardModels.remove(position);
                recyclerViewAdapter.notifyItemRemoved(position);
            }
        });

    }
    private void approveUser(String approved, int userId) {
        ApproveOrRejectRequest approveOrRejectRequest = new ApproveOrRejectRequest(userId,approved);
        Call<ApproveOrRejectResponse> approveOrRejectResponseCall = apiService.getRejectResponse(approveOrRejectRequest);
        approveOrRejectResponseCall.enqueue(new Callback<ApproveOrRejectResponse>() {
            @Override
            public void onResponse(Call<ApproveOrRejectResponse> call, Response<ApproveOrRejectResponse> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(getContext(), String.valueOf(response.code()), Toast.LENGTH_LONG).show();
                }
                ApproveOrRejectResponse approveOrRejectResponse = response.body();

            }

            @Override
            public void onFailure(Call<ApproveOrRejectResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void rejectUser(String rejected, int userId) {
        ApproveOrRejectRequest approveOrRejectRequest = new ApproveOrRejectRequest(userId, rejected);
        Call<ApproveOrRejectResponse> approveOrRejectResponseCall = apiService.getRejectResponse(approveOrRejectRequest);
        approveOrRejectResponseCall.enqueue(new Callback<ApproveOrRejectResponse>() {
            @Override
            public void onResponse(Call<ApproveOrRejectResponse> call, Response<ApproveOrRejectResponse> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getContext(), String.valueOf(response.code()), Toast.LENGTH_LONG).show();
                }
                ApproveOrRejectResponse approveOrRejectResponse = response.body();
                //Toast.makeText(getContext(), approveOrRejectResponse.getEmail(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ApproveOrRejectResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
            }
        });
    }


}