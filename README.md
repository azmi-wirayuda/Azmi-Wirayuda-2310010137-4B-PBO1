# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Pasien`, dan `AplikasiKlinik` adalah contoh dari class.

```bash
public class Orang { ... }
public class Pasien extends Orang { ... }
public class AplikasiKlinik { ... }

```

2. **Object** adalah instance dari class. Pada kode ini, `daftarPasien[jumlah] = new Pasien(nama, umur, penyakit);` adalah contoh pembuatan object.

```bash
daftarPasien[jumlah] = new Pasien(nama, umur, penyakit);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `penyakit` adalah contoh atribut.

```bash
protected String nama;
private String penyakit;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang` dan `Pasien`.

```bash
public Orang(String nama, int umur) { ... }
public Pasien(String nama, int umur, String penyakit) {
    super(nama, umur);
    this.penyakit = penyakit;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setPenyakit` adalah contoh method mutator.

```bash
public void setPenyakit(String penyakit) {
    this.penyakit = penyakit;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getPayakit`, adalah contoh method accessor.

```bash
public String getPenyakit() {
    return penyakit;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `Penyakit` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String penyakit;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Pasien` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Pasien extends Orang { ... }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.

```bash
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Penyakit: " + penyakit);
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else`.

```bash
if (pilihan == 1) {
    ...
} else if (pilihan == 2) {
    ...
} else {
    ...
}

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
while (true) {
    ...
}
for (int i = 0; i < jumlah; i++) {
    daftarPasien[i].tampilkanInfo();
}

```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Nama Pasien: ");
String nama = input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Pasien[] daftarPasien = new Pasien[100];` adalah contoh penggunaan array.

```bash
Pasien[] daftarPasien = new Pasien[100];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    int pilihan = Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid!");
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

Nama: Azmi Wirayuda
NPM: 2310010137
Prodi: TI
Falultas: FTI
