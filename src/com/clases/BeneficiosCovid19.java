package com.clases;




public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private String valorSubsidio;

    public BeneficiosCovid19(String id, String nombre, String valorSubsidio) {
        this.id = id;
        this.nombre = nombre;
        this.valorSubsidio = valorSubsidio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(String valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }


    //Completar clase



    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios

    public Float getMejorbeneficios()

    {

        return Float.valueOf(0);
    }
}
