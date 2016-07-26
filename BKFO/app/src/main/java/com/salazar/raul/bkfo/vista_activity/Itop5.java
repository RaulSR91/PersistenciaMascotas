package com.salazar.raul.bkfo.vista_activity;

import com.salazar.raul.bkfo.adapter.MascotaAdaptador;
import com.salazar.raul.bkfo.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by Spartan117 on 26/07/2016.
 */
public interface Itop5 {

    public MascotaAdaptador CrearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptadorRVTop5(MascotaAdaptador mascota);

    public void generarLinearLayoutVerticalTop5();


}

