# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `AirConditioner`, `AirConditionerDetail`, dan `AirConditionerBeraksi` adalah contoh dari class.

```bash
public class AirConditioner {
    ...
}

public class AirConditionerDetail extends AirConditioner {
    ...
}

public class AirConditionerBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `AC[i] = new AirConditionerDetail(nama, npm);` adalah contoh pembuatan object.

```bash
AC[i] = new AirConditionerDetail(nama, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
String nama;
String harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `AirConditioner` dan `AirConditionerDetail`.

```bash
public Mahasiswa(String nama, String harga {
    this.nama = nama;
    this.npm = harga;
}

public MahasiswaDetail(String nama, String harga) {
    super(nama, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNpm(String harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getTahunBerdiri`, `getGantiNama`, `getMasukIndoesia`, dan `getPenjualan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `AirConditionerDetail` mewarisi `AirConditioner` dengan sintaks `extends`.

```bash
public class AirConditionerDetail extends AirConditioner {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `AirConditioner` merupakan overloading method `displayInfo` dan `displayInfo` di `AirConditionerDetail` merupakan override dari method `displayInfo` di `AirConditioner`.

```bash
public String displayInfo(String ) {
    return displayInfo() + "\nRefrigent: " + refrige;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getGantiNama` dan seleksi `switch` dalam method `getMasukIndonesia`.

```bash
public String getGantiNama() {
    if(getHarga().substring(2, 6).equals("1963")){
        return "Ganti Nama Perusahaan";
    } else {
        return "Perusahaan lain";
    }

    //return getHarga().substring(2, 6).equals("10") ? "Ganti Nama Perusahaan" : "Perusahaan lain";
}

public String getMasukIndonesia() {
    switch(getHarga().substring(6,10)) {
        case "2012":
            return "Daikin Biasa";
        case "2013":
            return "Daikin Inverter";
        default:
            return "Merk lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < AirConditioner.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama AC ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData AirConditioner:");
System.out.println(AirConditioner.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `AirConditionerDetail[] AC = new AirConditionerDetail[2];` adalah contoh penggunaan array.

```bash
AirConditionerDetail[] AC = new AirConditionerDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Subhan
NPM: 2110010251
