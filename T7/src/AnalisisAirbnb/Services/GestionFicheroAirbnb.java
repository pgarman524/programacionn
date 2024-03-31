package AnalisisAirbnb.Services;

import Tema7Teoria.ProyectoAirBnB.Model.Alojamiento;
import Tema7Teoria.ProyectoAirBnB.Model.Propietario;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GestionFicheroAirbnb {

    // Extrae del documento malaga.csv los siguientes datos:
    //a. id, name, host_id, host_name, price.


    public ArrayList<Alojamiento> leerFicheroAlojamineto(String ruta) {

        ArrayList<Alojamiento> arrDeAlojamintoTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);


                String id = "";
                String name = "";
                String host_id = "";
                String host_name = "";
                double price = 0;


                String lineaDelFichero = br.readLine();
                int i = 0;


                while (lineaDelFichero != null) {
                    if (i == 0) {
                        i++;
                    }

                    String[] infoAirBnB = lineaDelFichero.split(",");
                    id = infoAirBnB[0];
                    name = infoAirBnB[1];
                    host_id = infoAirBnB[2];
                    host_name = infoAirBnB[3];
                    try {
                        price = Double.parseDouble(infoAirBnB[9]);
                    } catch (Exception e) {
                        System.out.println("No posible pasar a double");
                    }

                    Propietario p = new Propietario(host_id, host_name);

                    Alojamiento a = new Alojamiento(id, name, p, price);

                    if (!arrDeAlojamintoTemporal.contains(a)) {
                        arrDeAlojamintoTemporal.add(a);
                    }

                    lineaDelFichero = br.readLine();
                }
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {

            return null;
        }

        return arrDeAlojamintoTemporal.size() != 0 ? arrDeAlojamintoTemporal : null;
    }


    public ArrayList<Alojamiento> leerYMostrar20BaratosAlojamineto(String ruta) {
        ArrayList<Alojamiento> arrDeAlojamintoTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
            try (FileReader fr = new FileReader(fichero);
                 BufferedReader br = new BufferedReader(fr)) {

                String id, nombre, host_id, host_name;
                double precio;

                String lineaDelFichero = br.readLine();

                int i = 0;

                while (lineaDelFichero != null) {
                    if (i == 0) {
                        i++;
                    }

                    String[] infoAirBnB = lineaDelFichero.split(",");
                    id = infoAirBnB[0] + " ";
                    nombre = infoAirBnB[1] + " ";
                    host_id = infoAirBnB[2] + " ";
                    host_name = infoAirBnB[3] + " ";

                    try {
                        precio = Double.parseDouble(infoAirBnB[10]);
                    } catch (NumberFormatException e) {
                        System.out.println("No se pudo convertir a double en la línea: " + lineaDelFichero);
                        lineaDelFichero = br.readLine();
                        continue; // Salta al siguiente ciclo del bucle
                    }

                    Propietario p = new Propietario(host_id, host_name);
                    Alojamiento a = new Alojamiento(id, nombre, p, precio);

                    // Agregar el alojamiento a la lista temporal
                    arrDeAlojamintoTemporal.add(a);

                    lineaDelFichero = br.readLine();
                }

                // Ordenar la lista por precio
                arrDeAlojamintoTemporal.sort(Comparator.comparingDouble(Alojamiento::getPrecio));

                // Imprimir los 20 alojamientos más baratos
                for (int f = 0; f < 20 && f < arrDeAlojamintoTemporal.size(); f++) {
                    System.out.println(arrDeAlojamintoTemporal.get(f));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se puede leer el archivo");
            return null;
        }

        return arrDeAlojamintoTemporal.isEmpty() ? null : arrDeAlojamintoTemporal;
    }


    public ArrayList<Alojamiento> leerYMostrar20CarosAlojamineto(String ruta) {
        ArrayList<Alojamiento> arrDeAlojamientoTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
            try (FileReader fr = new FileReader(fichero);
                 BufferedReader br = new BufferedReader(fr)) {

                String id, nombre, host_id, host_name;
                double precio;

                String lineaDelFichero = br.readLine();

                int i = 0;

                while (lineaDelFichero != null) {
                    if (i == 0) {
                        i++;
                    }

                    String[] infoAirBnB = lineaDelFichero.split(",");
                    id = infoAirBnB[0] + " ";
                    nombre = infoAirBnB[1] + " ";
                    host_id = infoAirBnB[2] + " ";
                    host_name = infoAirBnB[3] + " ";

                    try {
                        precio = Double.parseDouble(infoAirBnB[10]);
                    } catch (NumberFormatException e) {
                        System.out.println("No se pudo convertir a double en la línea: " + lineaDelFichero);
                        lineaDelFichero = br.readLine();
                        continue; // Salta al siguiente ciclo del bucle
                    }

                    Propietario p = new Propietario(host_id, host_name);
                    Alojamiento a = new Alojamiento(id, nombre, p, precio);

                    // Agregar el alojamiento a la lista temporal
                    arrDeAlojamientoTemporal.add(a);

                    lineaDelFichero = br.readLine();
                }

                // Ordenar la lista por precio en orden descendente
                arrDeAlojamientoTemporal.sort((a1, a2) -> Double.compare(a2.getPrecio(), a1.getPrecio()));

                // Imprimir los 20 alojamientos más caros
                for (int f = 0; f < 20 && f < arrDeAlojamientoTemporal.size(); f++) {
                    System.out.println(arrDeAlojamientoTemporal.get(f));

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se puede leer el archivo");
            return null;
        }

        return arrDeAlojamientoTemporal.isEmpty() ? null : arrDeAlojamientoTemporal;
    }


    public void escribirFicheroAirBnB(ArrayList<Alojamiento> arrAlojamiento) {
        File fichero = new File("AnalisisAirbnb/Archivos/datos_malaga.csv");


        // Comprobamos que existe, que efectivamente es un file y que tiene los permisos adecuados de escritura
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;


            try {
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                // Debemos recorrer el ArrayList arrAlojamiento para acceder a todos los registros almacenados en él

                for (Alojamiento a : arrAlojamiento) {
                    //EL formato  para escribir será:
                    //id, name, host_id, host_name, precio


                    String linea = a.getId() + "," +
                            a.getName() + "," +
                            a.getPropietario().getHost_id() + "," +
                            a.getPropietario().getHost_name() + "," +
                            Double.toString(a.getPrecio()) + "\n";

                    bw.write(linea);
                }

                // Por último, cerramos los flujos de escritura
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public ArrayList<Alojamiento> obtenerPresupuesto(String ruta) {
        ArrayList<Alojamiento> arrDeAlojamientoTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
            try (FileReader fr = new FileReader(fichero);

                 Scanner scan = new Scanner(System.in);


                 BufferedReader br = new BufferedReader(fr)) {

                String id, nombre, host_id, host_name;
                double precio;

                String lineaDelFichero = br.readLine();

                int i = 0;
                System.out.println("Introduzca el presupuesto máximo: ");
                double presupuestoMax = scan.nextDouble();


                while (lineaDelFichero != null) {
                    if (i == 0) {
                        i++;
                    }

                    String[] infoAirBnB = lineaDelFichero.split(",");
                    id = infoAirBnB[0] + " ";
                    nombre = infoAirBnB[1] + " ";
                    host_id = infoAirBnB[2] + " ";
                    host_name = infoAirBnB[3] + " ";

                    try {
                        precio = Double.parseDouble(infoAirBnB[9]);
                    } catch (NumberFormatException e) {
                        System.out.println("No se pudo convertir a double en la línea: " + lineaDelFichero);
                        lineaDelFichero = br.readLine();
                        continue; // Salta al siguiente ciclo del bucle
                    }
                    try {


                    if (precio < presupuestoMax) {


                        Propietario p = new Propietario(host_id, host_name);
                        Alojamiento a = new Alojamiento(id, nombre, p, precio);

                        // Agregar el alojamiento a la lista temporal
                        arrDeAlojamientoTemporal.add(a);

                        lineaDelFichero = br.readLine();
                    } else {
                        break;

                    }
                    }catch (Exception e){

                    }
                }

                // Ordenar la lista por precio en orden descendente
                arrDeAlojamientoTemporal.sort((a1, a2) -> Double.compare(a2.getPrecio(), a1.getPrecio()));

                // Imprimir los 20 alojamientos más caros
                for (int f = 0; f < 20 && f < arrDeAlojamientoTemporal.size(); f++) {
                    System.out.println(arrDeAlojamientoTemporal.get(f));

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se puede leer el archivo");
            return null;
        }

        return arrDeAlojamientoTemporal.isEmpty() ? null : arrDeAlojamientoTemporal;
    }




    public void modificarPrecioAlojamiento(ArrayList<Alojamiento> arrAlojamiento) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el ID del alojamiento a modificar
        System.out.println("Ingrese el ID del alojamiento que desea modificar:");
        int idAlojamiento = scanner.nextInt();

        // Buscar el alojamiento con el ID proporcionado por el usuario
        Alojamiento alojamientoAModificar = null;
        for (Alojamiento a : arrAlojamiento) {
            if (a.getId().equalsIgnoreCase(String.valueOf(idAlojamiento))){
                alojamientoAModificar = a;
                break;
            }
        }

        // Verificar si se encontró el alojamiento
        if (alojamientoAModificar != null) {
            // Mostrar los datos del alojamiento
            System.out.println("Datos del alojamiento a modificar:");
            System.out.println("ID: " + alojamientoAModificar.getId());
            System.out.println("Nombre: " + alojamientoAModificar.getName());
            System.out.println("ID del propietario: " + alojamientoAModificar.getPropietario().getHost_id());
            System.out.println("Nombre del propietario: " + alojamientoAModificar.getPropietario().getHost_name());
            System.out.println("Precio actual: " + alojamientoAModificar.getPrecio());

            // Pedir al usuario el nuevo precio
            System.out.println("Ingrese el nuevo precio:");
            double nuevoPrecio = scanner.nextDouble();

            // Modificar el precio del alojamiento
            alojamientoAModificar.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado correctamente.");
        } else {
            System.out.println("No se encontró ningún alojamiento con el ID proporcionado.");
        }
    }



    // --

}
