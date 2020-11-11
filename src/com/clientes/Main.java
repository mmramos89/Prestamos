package com.clientes;

import com.clases.BeneficiosCovid19;
import com.clases.Clientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<BeneficiosCovid19> lista1 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            //System.out.println("ingrese id");
            //br.readLine();
            String id = getIdBeneficio();
            System.out.println("ingrese beneficio");
            String nombre = br.readLine();
            System.out.println("ingrese valor subsidio");
            String valorSub = br.readLine();
            lista1.add(new BeneficiosCovid19(id, nombre, valorSub));
        }


        for (int i = 0; i < lista1.size(); i++) {
            BeneficiosCovid19 datoaux = lista1.get(i);
            System.out.println("ID " + datoaux.getId());
            System.out.println("nombre " + datoaux.getNombre());
            System.out.println("valor subsidio " + datoaux.getValorSubsidio());

        }
        int aux = 0;
        for (int i = 0; i < lista1.size(); i++) {

            if (Integer.parseInt(lista1.get(i).getValorSubsidio()) > aux) {
                aux = Integer.parseInt(lista1.get(i).getValorSubsidio());

            }

        }
        System.out.println(" El mayor de la lista 1 es : " + aux);


        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<BeneficiosCovid19> lista2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            //System.out.println("ingrese id");
            //br2.readLine();

            String id = getIdBeneficio();
            System.out.println("ingrese beneficio");
            String nombre = br2.readLine();
            System.out.println("ingrese valor subsidio");
            String valorSub = br2.readLine();
            lista2.add(new BeneficiosCovid19(id, nombre, valorSub));
        }


        for (int i = 0; i < lista2.size(); i++) {
            BeneficiosCovid19 datoaux = lista2.get(i);
            System.out.println("ID " + datoaux.getId());
            System.out.println("nombre " + datoaux.getNombre());
            System.out.println("valor subsidio " + datoaux.getValorSubsidio());


        }
        int aux2 = 0;

        for (int i = 0; i < lista2.size(); i++) {
            if (Integer.parseInt(lista2.get(i).getValorSubsidio()) > aux2) {
                aux2 = Integer.parseInt(lista2.get(i).getValorSubsidio());

            }
        }
        System.out.println("El mayor de la lista 2 es: " + aux2);


        if (aux > aux2) {
            System.out.println("La lista con el mayor beneficio lo tine la Lista1 " + aux);
            Clientes cliente1 = new Clientes("Milena", 12345, lista1);
            System.out.println("Nombre cliente: " + cliente1.getNombre());

            for (int i = 0; i < lista1.size(); i++) {
                if (Integer.parseInt(lista1.get(i).getValorSubsidio()) == aux) {
                    System.out.println("Nombre beneficio :" + lista1.get(i).getNombre());
                    System.out.println("Id beneficio: :" + lista1.get(i).getId());
                    System.out.println("Valor beneficio: :" + lista1.get(i).getValorSubsidio());
                }
            }


        } else {
            System.out.println("La lista con el mayor beneficio lo tiene la lista2 " + aux2);
            Clientes cliente2 = new Clientes("Jose", 5678, lista2);
            System.out.println("Nombre cliente: "+cliente2.getNombre());

            for (int i = 0; i < lista2.size(); i++) {
                if (Integer.parseInt(lista2.get(i).getValorSubsidio())==aux2){
                    System.out.println("ID " + lista2.get(i).getId());
                    System.out.println("nombre " + lista2.get(i).getNombre());
                    System.out.println("valor subsidio " + lista2.get(i).getValorSubsidio());
                }



            }

        }

        // write your code her  Clientes cliente2 = new Clientes("Jose", 4321, lista2);

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */


    }

    /**
     * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
     * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
     * Abarcar los operadores terniarios para condiciones logicas
     * Operadores logicos
     * Operacionres aritmeticos
     **/


    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio() {
        int id = (int) (Math.random() * 20 + 1);

        return "" + id;
    }
}
