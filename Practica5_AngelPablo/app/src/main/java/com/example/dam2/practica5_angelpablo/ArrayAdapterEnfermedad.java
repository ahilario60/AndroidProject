package com.example.dam2.practica5_angelpablo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by dam2 on 03/02/2017.
 */




public class ArrayAdapterEnfermedad extends ArrayAdapter<Enfermedad>{

    private Context contexto;


    public ArrayAdapterEnfermedad(Context context, ArrayList<Enfermedad> arrayEnfermedad) {
       super(context,0,arrayEnfermedad);
        this.contexto=context;
    }

    public View getView(int posicion, View convertView, ViewGroup grupo){

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.listview_enfermedades,grupo,false);

        }



        return convertView;
    }
}
