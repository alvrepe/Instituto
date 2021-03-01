package instituto;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    private static Instituto pideInstituto() {
        System.out.println("Introduce el nombre del instituto");
        String nombre = scan.nextLine();
        Grupo[] grupos = pideGrupos();
        Instituto instituto = new Instituto(nombre, grupos);
        return instituto;
    }

    private static Grupo[] pideGrupos() {
        System.out.println("Cuántos grupos vas a introducir");
        int n = scan.nextInt();
        scan.nextLine();

        while (n < 1) {
            System.out.println("Debe haber al menos un grupo, cuántos grupos...");
            n = scan.nextInt();
            scan.nextLine();
        }
        Grupo[] grupos = new Grupo[n];
        for (int i = 0; i < grupos.length; i++) {
            grupos[i] = pideGrupo();
        }
        return grupos;
    }

    private static Grupo pideGrupo() {
        System.out.println("Introduce el nombre del grupo");
        String nombre = scan.nextLine();
        System.out.println("Introduce el aula del grupo");
        String aula = scan.nextLine();

        Alumno[] alumnos = pideAlumnos();

        Grupo grupo = new Grupo(nombre, aula, alumnos);
        return grupo;
    }

    private static Alumno[] pideAlumnos() {
        System.out.println("Cuántos alumnos vas a introducir");
        int n = scan.nextInt();
        scan.nextLine();
        while (n < 1) {
            System.out.println("Debe haber al menos un alumno, cuántos alumnos hay...");
            n = scan.nextInt();
            scan.nextLine();
        }

        Alumno[] alumnos = new Alumno[n];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = pideAlumno();
        }
        return alumnos;
    }

    private static Alumno pideAlumno() {
        System.out.println("Introduce el nombre del alumno");
        String nombre = scan.nextLine();
        System.out.println("Introduce los apellidos del alumno");
        String apellidos = scan.nextLine();
        System.out.println("Introduce el código postal");
        int cp = scan.nextInt();
        scan.nextLine();

        Alumno alumno = new Alumno(nombre, apellidos, cp);
        return alumno;
    }

    public static void main(String[] args) {
       Instituto instituto = pideInstituto();

       instituto.printInfo();

       instituto.printAlumnosEnCp(1);

    }
}
