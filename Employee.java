/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 Nama       : Alfin Prasetio
 Nim        : 22166028
 Prodi      : Sistem Informasi
 Semester   : 3
 */
public class Employee {

    private String nama;

    public Employee(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama()+" bekerja sebagai Manager");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama()+ " Mengembangkan sebuah aplikasi");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getNama() + " Membuat desain web");
    }
}

class MainEmployee {

    public static void main(String[] args) {
        Manager manager = new Manager("Alfin Prasetio");
        Developer developer = new Developer("Alfin Prasetio");
        Designer designer = new Designer("Alfin Prasetio");

        // Memanggil metode work() pada setiap objek
        manager.work();
        developer.work();
        designer.work();
    }

}
