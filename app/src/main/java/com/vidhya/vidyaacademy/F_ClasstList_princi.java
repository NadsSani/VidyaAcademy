package com.vidhya.vidyaacademy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class F_ClasstList_princi extends Fragment {

    ArrayList<Princi_Classlist_Adpter> arrayList1;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    SharedPreferences sharedPreferences;
    DatabaseReference databaseReference;
    String AdminID;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate( R.layout.fragment_recy_princi_cardclass,container,false );

        /*Intent i = getActivity().getIntent();
        AdminID = i.getStringExtra( "AdminID" );
        Log.e( "Admin", AdminID );


        arrayList1 = new ArrayList<>();
        databaseReference = FirebaseDatabase.getInstance().getReference( "users/admin/" + AdminID );
        final RecyclerView recyclerforclasscard = (RecyclerView) view.findViewById( R.id.recyclerforclasscard );

        recyclerforclasscard.setHasFixedSize( true );

        LinearLayoutManager layoutManagern = new LinearLayoutManager( getContext() );

        recyclerforclasscard.setLayoutManager( layoutManagern );

        databaseReference.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    Log.e( "children", dataSnapshot1.getChildren().toString() );

                    switch (dataSnapshot1.getKey().toString()) {


                        case "password":
                            continue;
                        case "name":
                            continue;
                        case "address":
                            continue;
                        case "email":
                            continue;
                        case "phno":
                            continue;
                        case "image":
                            continue;
                        case "pending":
                            continue;
                        default:
                            Princi_Classlist_Adpter princi_class_cardDetails = new Princi_Classlist_Adpter( dataSnapshot1.getChildren().toString(), dataSnapshot1.getKey().toString() );
                            arrayList1.add( princi_class_cardDetails );


                    }


                }
                RecyclerViewForClassInfo_princi playAdapternew = new RecyclerViewForClassInfo_princi( getActivity(), arrayList1,AdminID );
                recyclerforclasscard.setAdapter( playAdapternew );

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText( getActivity(), "there is some error found", Toast.LENGTH_SHORT ).show();

            }
        } );
*/


        return view;
    }
}
