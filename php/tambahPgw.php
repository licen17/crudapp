<?php

 /*
 
 penulis: Muhammad yusuf
 website: https://www.kodingindonesia.com/
 
 */

	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$name = $_POST['name'];
		$desg = $_POST['desg'];
		$sal = $_POST['salary'];
		$sex = $_POST['sex'];
		
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO tb_pegawai (nama,posisi,gajih,jk) VALUES ('$name','$desg','$sal','$sex')";
		
		//Import File Koneksi database
		require_once('koneksi.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Menambahkan Pegawai';
		}else{
			echo 'Gagal Menambahkan Pegawai';
		}
		
		mysqli_close($con);
	}
?>