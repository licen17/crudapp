package com.example.crud;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD= "http://192.168.1.27/Android/pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.1.27/Android/pegawai/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.1.27/Android/pegawai/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.27/Android/pegawai/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.27/Android/pegawai/hapusPgw.php?id=";
    public static final String URL_GET_POSISI = "http://192.168.1.27/Android/pegawai/getPosisi.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih
    public static final String KEY_EMP_JK = "sex";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";
    public static final String TAG_JK = "sex";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
