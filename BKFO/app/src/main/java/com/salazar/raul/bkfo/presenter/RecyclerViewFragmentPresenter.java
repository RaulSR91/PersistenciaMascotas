package com.salazar.raul.bkfo.presenter;

import android.content.Context;

import com.salazar.raul.bkfo.DB.ConstructorMascotas;
import com.salazar.raul.bkfo.pojo.Mascotas;
import com.salazar.raul.bkfo.vista_fragment.IRecyclerViewFragmentView;

import java.util.ArrayList;

/**
 * Created by Spartan117 on 25/07/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascotas> mascotas;
    private Context context;



    public  RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context ){
        this.iRecyclerViewFragmentView  = iRecyclerViewFragmentView;
        this.context = context;
        this.obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);

        mascotas = constructorMascotas.obtenerDatos();




        this.mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.CrearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
