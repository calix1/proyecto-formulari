package com.example.jersonmartinez.formulario.database.models;

import com.example.jersonmartinez.formulario.database.PERSONA;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.Locale;

import unadeca.net.formulariopry.database.PersonDB;


@Table(database = PERSONA.class)
public class Person extends BaseModel {
    @Column
    @PrimaryKey (autoincrement = true)
    public int id;

    @Column
    public String nombre;

    @Column
    public String apellido;

    @Column
    public  int edad;

    @Column
    public String pais;




    public String toString(){
        return String.format(Locale.getDefault(),"Nombre: %s\nApellido: %s\nEdad: %d\nPais: %s\nOcupacion: %s",
                this.nombre, this.apellido, this.edad, this. pais,);
    }


}
